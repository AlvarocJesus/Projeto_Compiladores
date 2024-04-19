# Analisador Sintático

## Gramaticas livres de contexto

### IF

```
S -> depende (condicao) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)
operador -> "!=" | "==" | ">" | "<" | "==" | "+" | "-" | "*" | "/"

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### For

```
S -> depende (condicao) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)
operador -> "!=" | "==" | ">" | "<" | "==" | "+" | "-" | "*" | "/"

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### While

```
S -> while ( condicao ) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)
operador -> "!=" | "==" | ">" | "<" | "==" | "+" | "-" | "*" | "/"

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### Atribuição Variável

```
S -> tipo id = (string | num | expressao)
expressao -> (id | num) operador (id | num)
operador -> "!=" | "==" | ">" | "<" | "==" | "+" | "-" | "*" | "/"

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### Funcao

```
S -> id ( parametro ) { expressao }
parametro -> tipo id | [tipo id , ]*
expressao -> expressao -> (id | num) operador (id | num)

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### Classe

```
S -> id { expressao }
expressao -> expressao -> (id | num) operador (id | num)

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### Comentario

```
S -> comentario
comentario -> # texto

texto -> [a-zA-Z0-9]*
```
























