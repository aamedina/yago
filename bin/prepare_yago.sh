#!/bin/bash

# Check if at least two arguments are given (input file and output directory)
if [ "$#" -ne 3 ]; then
    echo "Usage: $0 <input_file.ttl> <output_directory> <query_file.rq>"
    exit 1
fi

# Validate input file
INPUT_FILE="$1"
if [ ! -f "$INPUT_FILE" ]; then
    echo "Error: File $INPUT_FILE does not exist!"
    exit 2
fi

OUTPUT_DIR="$2"
export PREFIXES_FILE="${OUTPUT_DIR}/prefixes.ttl"
export QUERY_FILE="$3"

# Create the output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Extract prefixes and store them in a separate file
awk '/@prefix/ {print > "'$PREFIXES_FILE'"} !/@prefix/ {exit}' "$INPUT_FILE"

# Remove prefixes from the input file and store the result in a temporary file
awk 'BEGIN {skip=0} /@prefix/ {skip=1} !/@prefix/ && skip {skip=0; next} !skip {print}' "$INPUT_FILE" > "${INPUT_FILE}.tmp"

# Function to add prefixes to a chunk
add_prefixes() {
    chunk=$1
    cat "$PREFIXES_FILE" "$chunk" > "${chunk}_prefixed"
    mv "${chunk}_prefixed" "$chunk"
}

# Export the function to be used by parallel
export -f add_prefixes

# Split the dataset without prefixes into chunks of 100,000 lines each and add prefixes in parallel
split -l 100000 "${INPUT_FILE}.tmp" "${OUTPUT_DIR}/chunk_" | parallel -j+0 --eta add_prefixes {}

# Remove the temporary file
rm "${INPUT_FILE}.tmp"

# Function to filter a chunk using ARQ
filter_chunk() {
    chunk=$1
    arq --data="$PREFIXES_FILE" --data="$chunk" --query="$QUERY_FILE" --results=TTL > "${chunk}_filtered"
    mv "${chunk}_filtered" "$chunk"
}

# Export the function to be used by parallel
export -f filter_chunk

# Process each chunk in parallel using ARQ
find "$OUTPUT_DIR" -name "chunk_*" | parallel -j+0 --eta filter_chunk {}

echo "Processing complete!"
