#!/bin/bash

set -e  # Exit on error

# Check if the correct number of arguments are given (input files, output directory, and chunk size)
if [ "$#" -lt 3 ]; then
    echo "Usage: $0 <output_directory> <chunk_size> <input_file1.ttl> [<input_file2.ttl> ...]"
    exit 1
fi

OUTPUT_DIR="$1"
shift  # Shift off the output directory argument
CHUNK_SIZE="$1"
shift  # Shift off the chunk size argument

# Create the output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Extract prefixes from the first file and store them in a separate file in the output directory
PREFIXES_FILE="${OUTPUT_DIR}/prefixes.ttl"
awk '/@prefix/ {print}' "$1" > "$PREFIXES_FILE"

# Function to process an input file, split it into chunks and prepend prefixes to each chunk
process_file() {
    local input_file="$1"
    local output_dir="$2"
    local chunk_size="$3"
    local prefixes_file="$4"
    
    echo "Processing file: $input_file"
    
    # Split the input file without prefixes into chunks
    awk '!/@prefix/ {print}' "$input_file" | split -l "$chunk_size" -a 5 -d --additional-suffix=.ttl - "${output_dir}/$(basename "$input_file" .ttl)_chunk_"
    
    # Prepend prefixes to each chunk
    find "$output_dir" -name "$(basename "$input_file" .ttl)_chunk_*.ttl" | parallel "
        cat \"$prefixes_file\" {} > {.}_with_prefixes.ttl && mv {.}_with_prefixes.ttl {}
    "
}

# Export the function to be used by parallel
export -f process_file
export OUTPUT_DIR
export CHUNK_SIZE
export PREFIXES_FILE

# Process each input file in parallel
echo "$@" | tr ' ' '\n' | parallel -j $(nproc) process_file {} "$OUTPUT_DIR" "$CHUNK_SIZE" "$PREFIXES_FILE"

echo "Processing complete! Chunks are available in $OUTPUT_DIR"
