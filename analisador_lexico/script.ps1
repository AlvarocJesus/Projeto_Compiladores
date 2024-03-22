echo "Compilando"

javac *.java

java -cp "$(pwd | Select-String [A-Z].*)" Main