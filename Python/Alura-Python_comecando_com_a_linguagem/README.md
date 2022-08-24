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

-----------------------------------------------------

    [11 - Tipagem de variáveis]

    Uma variável só passa a existir quando atribuímos um valor.
    É preciso atribuir um valor para inicializar uma variável, definindo
    assim o seu tipo.

    Não há declaração de variáveis estáticas em Python, como em linguagens 
    como C, Java ou C#. Nessas linguagens, indicamos o tipo e o nome das 
    variáveis e ela já passa a existir.
        int idade;
    
    Repare que só declaramos o tipo e o nome da variável, sem ter 
    atribuído o valor.

    Em Python, a variável só passa a existir quando atribuímos um valor, 
    como no exemplo abaixo:
        idade = 12
    
    Isso faz todo sentido, já que não temos uma declaração explícita do 
    tipo, como na linguagem Java ou C#. O interpretador do Python não 
    tem como assumir um tipo.

-----------------------------------------------------

    [12 - Para saber mais: Snake_Case]

    O Python utiliza por convenção o padrão Snake_Case para nomes de 
    variáveis (ou identificadores).

    Um exemplo de variáveis em Snake_Case são:
        idade_esposa = 20
        perfil_vip = 'Flávio Almeida'
        recibos_em_atraso = 30
    
    Em outras linguagens também se usa o padrão CamelCase. O mesmo 
    exemplo com CamelCase (que não é o padrão do Python):
        idadeEsposa = 20
        perfilVip = 'Flávio Almeida'
        recibosEmAtraso = 30
    
    Vamos seguir o padrão do Python nesse curso, que é o Snake_Case!

-----------------------------------------------------

# [02. Lidando com a entrada do usuário]
****
    [01 - Instalando e conhecendo o PyCharm]

    • Sublime Text
    • Atom

    Python IDE -> PyCharm
    https://www.jetbrains.com/pt-br/pycharm/

    Baixar o PyCharm Community.

    Testar a IDE.    

-----------------------------------------------------

    [02 - Mão na massa: Primeiro projeto com PyCharm]

-----------------------------------------------------

    [03 - Comparando variáveis]

    Corrigindo Spellchecking do PyCharm
    https://www.jetbrains.com/help/pycharm/spellchecking.html

-----------------------------------------------------

    [04 - Impossível acertar o número]

    numero_secreto = 42
    chute = input("Digite seu número")
    print("Você digitou ", chute)
    if(numero_secreto == chute):
        print("Você acertou")
    else:
        print("Você errou")

    Com base no código de Romário, temos as seguintes afirmações:

    a) Sempre exibirá a mensagem Você errou, independentemente se o 
    chute for igual ao número secreto
    b) Todo valor retornado pela função input é um número.
    c) É necessário converter o retorno de input para um número, 
    no caso, um inteiro.

    • Apenas B é falsa.

    Não importa o número digitado, a comparação com == envolvendo 
    tipos diferentes resultará em falso. Isso porque a função input 
    sempre retorna um texto (string). Sendo assim, é necessário converter 
    o valor retornado em inteiro, para que a comparação com outro inteiro, 
    no caso o numero_secreto, seja possível. Realizamos essa conversão 
    através da função int.

-----------------------------------------------------

    [05 - Onde foi que ela errou?]

    minha_idade = 26
    idade_namorado = 25
    if(minha_idade == idade_namorado)
        print('temos idades iguais')
    else:
        print('temos idades diferentes')

    Minha Resposta: Esqueceu do ":" após a linha do IF

    Resposta Oficial: O problema é que para indicar o início do bloco if, 
    é necessário utilizar dois pontos (:). Veja que no código dele faltou 
    os dois pontos.
    Importante também é sempre usar a indentação correta. Ou seja, depois 
    da linha com o if, devemos usar 4 espaços ou pressionar a tecla tab 
    para começar o novo bloco de código.

-----------------------------------------------------

    [06 - Comparação estranha]

    numero1 = 10
    numero2 = 10
    if(numero1 = numero2):
        print("São números iguais")

    Minha Resposta: Na linha do IF deveria ser "=="

    Resposta Oficial: O problema é que foi usado um = para realizar a 
    comparação. Quando usamos apenas um =, estamos atribuindo um valor 
    à variável. Para compararmos valores ou variáveis, usamos o ==.

-----------------------------------------------------

    [07 - O resultado da soma é]

    idade1 = 10
    idade2 = "20"
    print(idade1 + idade2)

    Minha Resposta: O código não funciona!

    Resposta Oficial: O código na verdade não funciona, e exibe a 
    seguinte mensagem de erro no console:
    unsupported operand type(s) for +: 'int' and 'str'
    Isso acontece porque não podemos realizar uma operação de soma 
    envolvendo uma string. Para resolvermos o problema, podemos 
    apelar para a função int(), que converte uma string que contém 
    um número, em um número inteiro:

-----------------------------------------------------

    [08 - E o resultado agora?]

    nome = "Nico"
    sobrenome = "Steppat"
    print(nome + sobrenome)

    Minha Resposta: NicoSteppat

    Resposta Oficial: A resposta correta é NicoSteppat.
    O caractere + aqui não tem o significado de somar e sim de 
    concatenar. Estamos concatenando (juntando) duas strings!
    Repare também que não há espaço entre as palavras. Para que 
    haja, basta fazer assim:
    nome = "Nico"
    sobrenome = "Steppat"
    print(nome, sobrenome)

    Lembrando que a função print automaticamente aplica um 
    separador entre os valores. O separador é um espaço por 
    padrão, mas pode ser reconfigurado pelo parâmetro sep:
    nome = "Nico"
    sobrenome = "Steppat"
    print(nome, sobrenome, sep="_")

-----------------------------------------------------

    [09 - Diferenças entre o Python 2 e o Python 3]

    $python3
    >>> print("python3")
    python3
    >>> print "python3"
        File "<stdin>", line 1
        print "python 3"
                       ^
        SyntaxError: Missing parentheses in call to 'print'
    >>> print("ola", "mundo")
    ola mundo
    >>> chute_str = input("Digite ")
    Digite 32
    >>> type(chute_str)
    <class 'str'>
    >>> raw_input("Digite")
        Traceback (most recent call last):
        File "<stdin>", line 1, in <module>
        NameError: name 'raw_input' is not defined
    >>>


    $python -V
        Python 2.7.10
    >>> print "python2"
    python2
    >>> print("python2")
    python2
    >>> print("ola", "mundo") // PRINT SE COMPORTA DE FORMA DIFERENTE
    ('ola', 'mundo')
    >>> print("ola", "mundo", sep="x") //NÃO TEM SEP
        File "<stdin>", line 1
        print("ola", "mundo", sep="x")
                                 ^
        SyntaxError: invalid syntax
    >>> print("ola", "mundo", end="x") // NÃO TEM END
        File "<stdin>", line 1
        print("ola", "mundo", end="x")
                                 ^
        SyntaxError: invalid syntax
    >>> chute_str = input("Digite ") // ANTIGAMENTE SE CONVERTIA AUTOMATICAMENTE
    Digite 32
    >>> type(chute_str)
    <type 'int'>
    >>> chute_str = raw_input("Digite ") // RAW_INPUT = INPUT DO PYTHON3
    Digite 32
    >>> type(chute_str)
    <type 'str'>
    >>>

-----------------------------------------------------

    [10 - Python 2 vs Python 3 - #1]

    As funções input(...), print(...) e int(...) existem no Python 3.
    A função raw_input(..) existe apenas no Python 2.

-----------------------------------------------------

    [11 - Python 2 vs Python 3 - #2]

    No Python 2, a função print não aceita o parâmetro nomeado sep.

-----------------------------------------------------

    [12 - Para saber mais: JavaScript vs Python]

-----------------------------------------------------

    [13 - Arquivos do projeto atual]

    https://github.com/alura-cursos/Curso-Python-3-parte-1-Introdu-o-nova-vers-o-da-linguagem/archive/capitulo2.zip

-----------------------------------------------------

# [03. Testando valores]
****
    [01 - A condição elif]

    elif = ELSE IF

-----------------------------------------------------
    
    [02 - Faixa Etária]

-----------------------------------------------------

    [03 - Faixa Etária - Variáveis]

-----------------------------------------------------

    [04 - If..else. e nada funciona!]

-----------------------------------------------------

    [05 - Mão na massa: Dando dicas]

-----------------------------------------------------

    [06 - Qual é o tipo?]

    Uma variável do tipo bool pode ter apenas dois valores, True ou False, que 
    podemos usar diretamente:

    passou = True
    errou = False

-----------------------------------------------------

    

    