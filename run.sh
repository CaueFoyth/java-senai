#!/bin/bash

# Verifica se foi passado o nome do arquivo Java como parâmetro
if [ $# -eq 0 ]; then
    echo "Por favor, forneça o nome do arquivo Java como parâmetro."
    exit 1
fi

# Obtém o nome do arquivo Java passado como parâmetro
java_file="$1"

# Verifica se o arquivo Java passado como parâmetro existe
if [ ! -f "src/$java_file.java" ]; then
    echo "Erro: O arquivo $java_file não foi encontrado."
    exit 1
fi

# Remove a extensão .java do nome do arquivo para obter o nome da classe
class_name=$(basename "src/$java_file" .java)

# Define o diretório de saída para os arquivos compilados
output_dir="bin"

# Compila o arquivo Java especificado
echo "Compilando..."
javac -d "$output_dir" "src/$java_file.java"

# Verifica se a compilação foi bem-sucedida
if [ $? -eq 0 ]; then
    echo "Compilação bem-sucedida."

    # Executa o arquivo compilado
    echo "Executando $class_name..."
    echo
    java -cp "$output_dir" "$class_name"
else
    echo "Erro ao compilar $java_file."
fi