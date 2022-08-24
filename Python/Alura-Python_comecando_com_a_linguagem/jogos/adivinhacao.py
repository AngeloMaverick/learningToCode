print("*********************************")
print("Bem vindo no jogo de Adivinhação!")
print("*********************************")

numero_secreto = 42
# Para receber um dado do teclado
chute_str = input("Digite o seu numero: ")

chute = int(chute_str)

acertou = chute == numero_secreto
maior = chute > numero_secreto
menor = chute < numero_secreto

print("Você digitou ", chute)

if acertou:
    print("Você acertou")
else:
    if maior:
        print("Você errou! O seu chute foi maior do que o número secreto.")
    elif menor:
        print("Você errou! O seu chute foi menor do que o número secreto.")

print("Fim do jogo")

# Digite o seu numero: 42
# Você digitou 42
# Você errou

# chute = "42"
# type(chute)
# <class 'str'>
# POIS A FUNÇÃO INPUT SEMPRE DEVOLVE UMA STRING!!!!
# DEVE CONVERTER O CONTEÚDO DA VIRIÁVEL CHUTE EM INT POR MEIO DA FUNÇÃO INT()

# elif = ELSE IF
