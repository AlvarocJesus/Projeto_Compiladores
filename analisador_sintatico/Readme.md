# Analisador Sintático

## Gramaticas livres de contexto

### IF -> Quse Ok

S -> depende (condicao) { expressao } else
else -> planoB { expressao } | ε
condicao -> (id | num) operador (id | num)
expressao -> (id | num) operador (id | num)
operador -> "!=" | "==" | ">" | "<" | "==" | "+" | "-" | "\*" | "/"

id -> [a-zA-z]⁺
num -> [0-9]⁺

### For -> Ok

S -> eOSeuNegocio (inicializacao; condicao; incremento) { expressao }
inicializacao -> tipo id = num
condicao -> id operador ( num | id )
incremento -> id operador operador
expressao -> (id | num) operador (id | num)
operador -> "!=" | "==" | ">" | "<" | "==" | "+" | "-" | "\*" | "/"

id -> [a-zA-z]⁺
num -> [0-9]⁺

### While -> Ok

S -> fazDeNovo ( condicao ) | (modo) { expressao } fim
condicao -> id operador num
expressao -> (id | num) operador (id | num)
modo -> null | true **acho que tem que tirar**
fim -> cheeega **ta usando no lugar errado**

id -> [a-zA-z]⁺
num -> [0-9]⁺

### Atribuição Variável -> Ok

S -> tipo id = atribuicao
tipo -> int | string | float
atribuicao -> num | id | string

id -> [a-zA-z]⁺
num -> [0-9]⁺

### Funcao

S -> id ( parametro ) { expressao }
parametro -> tipo id | [tipo id , ]\* | ε
expressao -> (id | num) operador (id | num)

id -> [a-zA-z]⁺
num -> [0-9]⁺

### Classe

S -> id { expressao }
expressao -> expressao -> (id | num) operador (id | num)

id -> [a-zA-z]⁺
num -> [0-9]⁺

### Comentário -> Ok

S -> comentario
comentario -> # texto

texto -> [a-zA-Z0-9]⁺
