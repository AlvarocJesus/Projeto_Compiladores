# Analisador Sintático

## Gramaticas livres de contexto

### First -> Ok

```txt
first -> depende first | fazDeNovo first | eOSeuNegocio first | olhaSo first | variavel first | comentario first | olhaSo first | ε
```

### Depende - IF

```txt
depende -> depende ( condicao ) { expressao } planoB
planoB -> planoB { expressao } | ε
condicao -> variavel operador variavel
variavel -> id | num | flutuante | string | ( mathExpressao )
operador -> ">" | "<" | "==" | "!=" | "&&" | "||" | "+" | "-" | "\" | "*" | "/" | "="
expressao -> variavel operador mathExpressao ";"

mathExpressao -> TmathExpressao’
mathExpressao’ -> +TmathExpressao’ | -TmathExpressao’ | ε
math -> Fmath´
math´ -> *Fmath´ | /Fmath´ | ε

id -> [a-zA-Z]⁺
num -> [0-9]⁺
flutuante -> num⁺.num⁺
string -> "(id+num+flutuante)"
```

### EOSeuNegocio - For

```txt
for -> eOSeuNegocio ( varContador ";" condicao ";" incremento ) { expressao }
varContador -> tipoVariavel variavel operador num
condicao -> variavel operador variavel
incremento -> variavel operador num | flutuante
expressao -> mathExpressao ";"

mathExpressao -> TmathExpressao’
mathExpressao’ -> +TmathExpressao’ | -TmathExpressao’ | ε
math -> Fmath´
math´ -> *Fmath´ | /Fmath´ | ε


tipoVariavel -> id | num | flutuante | string | ( mathExpressao )
variavel -> id | num | flutuante | string
operador -> ">" | "<" | "<=" | ">=" | "+=" | "-=" | "++" | "--"

id -> [a-zA-Z]⁺
num -> [0-9]⁺ | ε
flutuante -> num⁺.num⁺ | ε
string -> "(id+num+flutuante)"
```

### FazDeNovo - While

```txt
while -> fazDeNovo ( condicao ) { expressao }
condicao -> variavel operador variavel
expressao -> mathExpressao ";"

mathExpressao -> TmathExpressao’
mathExpressao’ -> +TmathExpressao’ | -TmathExpressao’ | ε
math -> Fmath´
math´ -> *Fmath´ | /Fmath´ | ε

varivel -> id | num | flutuante | string | ( mathExpressao )
operador -> ">" | "<" | "<=" | ">=" | "+=" | "-=" | "++" | "--"

id -> [a-zA-Z]⁺
num -> [0-9]⁺
flutuante -> num.num
string -> " (id + num + flutuante) "
```

### Atribuição Variável

```txt
atribVariavel -> tipoVariavel variavel "=" variavel ";"
tipoVariavel -> taOk | gaviao | caixaPreta
variavel -> id | num | flutuante | string

id -> [a-zA-Z]⁺
num -> [0-9]⁺
flutuante -> num.num
string -> " (id + num + flutuante) "
```

### Comentário

```txt
comentario -> # texto

texto -> [a-zA-Z0-9]⁺
```

### OlhaSo -> Print

```txt
print -> olhaSo ( texto ) ;
texto -> id | num | flutuante | string

id -> [a-zA-Z]⁺
num -> [0-9]⁺
flutuante -> num.num
string -> " (id + num + flutuante) "
```

### Função

```txt
funcao -> id "(" parametros ")" "{" expressao "}"
parametros -> tipoVariavel variavel parametros | "," parametros | ε
expressao -> mathExpressao ";"

mathExpressao -> TmathExpressao’
mathExpressao’ -> +TmathExpressao’ | -TmathExpressao’ | ε
math -> Fmath´

tipoVariavel -> id | num | flutuante | string | ( mathExpressao )
variavel -> id | num | flutuante | string

id -> [a-zA-Z]⁺
num -> [0-9]⁺
flutuante -> num.num
string -> " (id + num + flutuante) "
```

### Classe

```txt
classe -> id { expressao }
expressao -> mathExpressao ";"

mathExpressao -> TmathExpressao’
mathExpressao’ -> +TmathExpressao’ | -TmathExpressao’ | ε
math -> Fmath´
math´ -> *Fmath´ | /Fmath´ | ε

tipoVariavel -> id | num | flutuante | string | ( mathExpressao )

id -> [a-zA-Z]⁺
num -> [0-9]⁺
flutuante -> num.num
string -> " (id + num + flutuante) "
```
