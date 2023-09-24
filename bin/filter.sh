#!/bin/bash

# Check if the correct number of arguments are given
if [ "$#" -ne 3 ]; then
    echo "Usage: $0 <input_chunk_directory> <output_directory> <sparql_query_file>"
    exit 1
fi

# Define the directory containing the chunks
CHUNK_DIR="$1"

# Define the directory to store the processed chunks
OUTPUT_DIR="$2"
mkdir -p "$OUTPUT_DIR"

# Define the SPARQL query file
QUERY_FILE="$3"

# Function to process a chunk
process_chunk() {
  chunk="$1"
  output_file="${OUTPUT_DIR}/$(basename "$chunk")"
  
  # Run SPARQL query using arq and write the result to a temporary file
  arq --query="$QUERY_FILE" --data="$chunk" --results=nt > "${output_file}"
  
}

# Export function and variables to be used by parallel
export -f process_chunk
export QUERY_FILE
export OUTPUT_DIR

# Find all Turtle files in the chunk directory and process them in parallel
find "$CHUNK_DIR" -name '*.ttl' | parallel process_chunk
