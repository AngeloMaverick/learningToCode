# Alura
#### Python: começando com a linguagem
#### Nico Steppat

# [01. Instalação do Python 3]
****
    [01 - Apresentação]

-----------------------------------------------------

    [02 - Instalando o Python no Windows]

    1. Acessar o python.org
    2. Baixar e instalar o python
    3. Abrir Prompt
    4. Executar:
            $ python --version
            Python 3.10.5
    5. Executar:
            $ python
    6. Abrir Python 3.10 pelo Windows (Prompt Python)
    7. Abrir IDLE Python 3.10 pelo Windows (Pequena IDE Python)
   
-----------------------------------------------------

    [03 - Instalando em outras plataformas]

    LINUX
    1. Executar comandos:
            $ python3 -V
            Python 3.5.2

            $ python (mostrar todas as versões disponíveis)

            (Caso não tenha o Python 3)
            $ sudo apt-get install python3

            $ python3
    
    Mac OS
    1. Instalar o Homebrew: brew.sh/index_pt-br.html
    1. Executar comandos:
            $ brew update
            $ brew install python3

            $ python3 -V

-----------------------------------------------------

    [04 - Usar o Python sem instalá-lo]
    
    https://repl.it/

    // Exibir informação no console
    print("ola aluno! bem vindo!!")

-----------------------------------------------------

    [05 - Função print e variáveis]

    Abrir o prompt

    $ python -V             // Verificar a versão do Python
    $ python                // Inicializar o Python
    >>> print("ola mundo")  // Exibir informação no console
    >>> help()              // Inicializa o Python help
    help> print             // Exibe a documentação da função print
    
    print(value, ..., sep=' ', end='\n', file=sys.stdout, flush=False)
        value      // Valor a ser imprimido
        ...        // Pode se passar um ou mais valores
        sep        // Separador, o que irá ficar entre os valores
        end        // O que deveria acontecer no final
        \n         // Nova linha
        file       // Onde o print deveria imprimir
        sys.stdout // Console
        flush      // ???
    
    help> [CTRL+C] // Sai do help

    >>> print("Brasil ganhou 5 titulos mundiais")
    Brasil ganhou 5 titulos mundiais

    >>> print("Brasil", "ganhou", 5, "titulos mundiais", sep="-")
    Brasil-ganhou-5-titulos mundiais

    >>> print("Brasil", "ganhou", 5, "titulos mundiais", sep="")
    Brasilganhou5titulos mundiais

    >>> print("Brasil", "ganhou", 5, "titulos mundiais", end="\n")
    Brasil ganhou 5 titulos mundiais

    >>> print("Brasil", "ganhou", 5, "titulos mundiais", end="")
    Brasil ganhou 5 titulos mundiais>>> |

    >>> print("Brasil", "ganhou", 5, "titulos mundiais", end="END")
    Brasil ganhou 5 titulos mundiaisEND

    >>> pais = "Italia" // Armazena um valor em uma variável chamada "pais"
    
    >>> type(pais)      // Verifica o tipo da variável "pais"
    <class 'str'>       // Classe String 'str'

    >> quantidade = 4   // Armazena um valor sem aspas (ou seja, não é uma string)
    
    >>> type(quantidade)
    <class 'int'>       // Classe Interger 'int'

    >>> print(pais, "ganhou", quantidade, "titulos mundiais")
    Italia ganhou 4 titulos mundiais

    >>> pais = "Alemanha"

    >>> exit() // Sai do console Python

-----------------------------------------------------

    [06 - Imprimindo uma mensagem na tela]

    A função é a print(). Basta passar a mensagem como parâmetro 
    para a função, que a mensagem será impressa.

-----------------------------------------------------

    [07 - Personalizando a saída]

    subst = "Python"
    verbo = "é"
    adjetivo = "fantástico"
    print(subst, verbo, adjetivo, sep="_", end="!\n")
        Python_é_fantástico!

    Repare que usamos o parâmetro sep="_" para definir 
    um _ entre cada valor, por isso é impresso:
        Python_é_fantástico

    Além disso, definimos através do end para imprimir 
    uma exclamação (!), seguida pelo \n:
        end="!\n"

    Lembrando que o \n é um caractere especial, que faz 
    com que o novo prompt comece em uma nova linha.

    Com isso recebemos a saída:
        Python_é_fantástico!
        >>>

-----------------------------------------------------

    [08 - Imprimindo datas]

    Para representar uma data, temos as variáveis dia, mes e ano:
        dia = 15
        mes = 10
        ano = 2015
    
    Sem alterar as variáveis e sem passar nenhuma string adicional 
    à função print(), como faríamos para ter como resultado da impressão, 
    uma data formatada:
        15/10/2015
    
    Podemos alterar o separador entre os valores que a função print() recebe, 
    utilizando o parâmetro sep, que por padrão é um espaço em branco. Basta 
    utilizá-lo, dizendo que seu valor será uma barra (/):
        dia = 15
        mes = 10
        ano = 2015
        print(dia, mes, ano, sep="/")

        15/10/2015

-----------------------------------------------------

    [09 - Tipagem do Python]

    $ python
    >>> pais = "Brasil"
    >>> type(pais)
    <class 'str'>
    >>> pais = 644 // Mudança dinâmica de tipagem
    >>> type(pais)
    <class 'int'>
    >>> pais = 7.9
    >>> type(pais)
    <class 'float'>

-----------------------------------------------------

    [10 - Qual o tipo da variável?]

    Temos a seguinte variável, que representa o preço de um produto:
        preco = 49.99
    
    Qual será o tipo da variável preco? Faça o teste!
        float

    Transcrição:
    O valor 49.99, é um número decimal, ou seja, com um ponto flutuante, 
    por isso em Python o seu tipo será o float. Podemos verificar isso no 
    console do Python:
        preco = 49.99
        type(preco)
        <class 'float'>