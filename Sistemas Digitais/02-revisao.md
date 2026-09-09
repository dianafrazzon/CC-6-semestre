
- equecao booleana - soma do produto e produota das somas
- mapa de Karnaugh
- Portas Lógicas principais e derivadas
- representação gráfica a partir da tabela verdade

# Revisão de Conteúdo

**Por que utiliza-se sistema binário para os computadores?**  
-> sistema binário e a forma de representar circuitos, pois se baseiam em energia: desligado ou ligado. 

**Quais os limites dos níveis de tensão para 0 e 1?**  
-> para 0 = (0V - 0,8V), para 1 = (2,5V - 5V). Entre 0,8V e 2,5V é incerto 

## Álgebra Booleana

Álgebra Booleana usa de símbolos para representar uma expressão lógica, onde esta pode possuir apenas um de dois valores possíveis: verdadeiro ou falso. A diferença entre a álgebra convencional é que a álgebra booleana possui apenas 0 ou 1 para suas variáveis, e elas não representam alguma quantidade, mas o nível de tensão de uma variável. Oque chamamos de nível lógico.

## Operações Básicas
Representação de todas as possíveis entradas e suas saídas de um circuito

Operações Básicas:
- AND (A.B)
- OR (A+B) 
- NOT (A' ou ~A ou Ā)
- XOR (OR-exclusivo) ($A \oplus B$ ou $A \veebar B$)

Há operações compostas, como:
- XOR (combinação de AND, OR e NOT)
- NAND (NOT + AND)
- NOR (NOT + OR)
- XNOR (NOT + XOR)
- há outras derivações mais complexas como as aritméticas e de memória (latches e flip-flops)

|A|NOT|
|:---:|:---:|
|0|1|
|1|0|

|A  |B  |AND|OR |NAND|NOR|XOR|XNOR|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|0  |0  |0  |0  |1  |1  |0  |1  |
|0  |1  |0  |1  |1  |0  |1  |0  |
|1  |0  |0  |1  |1  |0  |1  |0  |
|1  |1  |1  |1  |0  |0  |0  |1  |

## Portas Lógicas 

Nos circuitos digitais as **operações lógicas** aparecem por meio das **portas lógicas** são componentes do circuito. Portas lógicas podem ser representadas por símbolos gráficos em diagramas.

A saída do circuito será o resultado de uma operação lógica básica com base na entrada.  
Uma porta AND é aquela em que a sua saída é igual à combinação das entradas por meio da operação AND.

## Propriedades

## Expressão Booleana

Há dois modos de fazermos equações:
- Soma de produtos, lista as combinações das variáveis para as quais a função de saída vale 1
- Produto de Somas, lista as combinações das variáveis para as quais a função de saída vale 0

