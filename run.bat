@echo off

REM Verifica se foi passado o nome do arquivo Java como parâmetro
if "%~1"=="" (
    echo Por favor, forneça o nome do arquivo Java como parâmetro.
    exit /b 1
)

REM Obtém o nome do arquivo Java passado como parâmetro
set "java_file=%~1"

REM Verifica se o arquivo Java passado como parâmetro existe
if not exist "src\%java_file%.java" (
    echo Erro: O arquivo %java_file% não foi encontrado.
    exit /b 1
)

REM Remove a extensão .java do nome do arquivo para obter o nome da classe
for %%F in ("src\%java_file%.java") do set "class_name=%%~nF"

REM Define o diretório de saída para os arquivos compilados
set "output_dir=bin"

REM Compila o arquivo Java especificado
echo Compilando %java_file%...
javac -d "%output_dir%" "src\%java_file%"

REM Verifica se a compilação foi bem-sucedida
if %errorlevel% equ 0 (
    echo Compilação bem-sucedida.

    REM Executa o arquivo compilado
    echo Executando %class_name%...
    java -cp "%output_dir%" "%class_name%"
) else (
    echo Erro ao compilar %java_file%.
)
