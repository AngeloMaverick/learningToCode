print("*********************************")
print("Bem vindo no jogo de Adivinhação!")
print("*********************************")

numero_secreto = 42
# Para receber um dado do teclado
chute_str = input("Digite o seu numero: ")

chute = int(chute_str)

print("Você digitou ", chute)

if numero_secreto == chute:
    print("Você acertou")
else:
    print("Você errou")

print("Fim do jogo")

# Digite o seu numero: 42
# Você digitou 42
# Você errou

# chute = "42"
# type(chute)
# <class 'str'>
# POIS A FUNÇÃO INPUT SEMPRE DEVOLVE UMA STRING!!!!
# DEVE CONVERTER O CONTEÚDO DA VIRIÁVEL CHUTE EM INT POR MEIO DA FUNÇÃO INT()
