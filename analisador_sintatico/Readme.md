# Analisador Sintático

## Gramaticas livres de contexto

### IF

```
S -> depende (condicao) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### For

```
S -> depende (condicao) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### While

```
S -> depende (condicao) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)

id -> [a-zA-z]_\*
num -> [0-9]_\*
```

### Atribuição Variável

```
S -> depende (condicao) { expressao }
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)

id -> [a-zA-z]_\*
num -> [0-9]_\*
```
