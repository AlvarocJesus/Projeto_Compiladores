cls

# echo "Iniciando Compilador Unix"

# javac */*.java

# java ./projeto/Main >> Main.java

# javac Main.java

# java Main

# Escreva a mensagem inicial
Write-Host "Iniciando Compilador PowerShell"

# Compile todos os arquivos Java na pasta atual e subpastas
Get-ChildItem -Recurse -Filter "*.java" | ForEach-Object {javac $_.FullName}

# Execute o arquivo Java e redirecione a saída para um novo arquivo Java na pasta raiz
java .\projeto\Main.java > .\Main.java

# Compile o novo arquivo Java
javac Main.java

# Execute o novo arquivo Java
java Main