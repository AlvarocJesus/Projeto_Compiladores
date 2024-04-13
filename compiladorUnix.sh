echo "Iniciando Compilador Unix"

javac -d bin src/compilador/*.java

java -cp bin compilador.Compilador

echo "Compilador Unix Finalizado"