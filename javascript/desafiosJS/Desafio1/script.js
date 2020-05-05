/*
    Desafio #1 - Analisando um jogo de Pedra, papel e tesoura

    Desenvolva um pequeno programa que consiga ao receber o resultado de um conjunto de disputas de "pedra, papel e tesoura" entre dois jogadores, saber qual deles venceu mais partidas.


    Formato de entrada:
    "SRRSPSRPPRSSSR"

    S = tesoura
    R = pedra
    P = papel


    Formato de saída:
    "O jogador X ganhou a disputa por X a Y"
    "O jogo empatou"
*/

let jogador1 = prompt("Nome do Jogador 1:");
let jogador2 = prompt("Nome do jogador 2:");
let disputas = prompt("Insira a string com as disputas");
let pontos1 = 0;
let pontos2 = 0;

// S X P = 1
// S X R = 2
// P X R = 1
// P X S = 2
// R X S = 1
// R X P = 2

for(let i = 0; i < disputas.length; i+=2){
    if(disputas[i] == "S" && disputas[i+1] == "P"){
        pontos1++;
    } else if(disputas[i] == "S" && disputas[i+1] == "R"){
        pontos2++;
    } else if(disputas[i] == "P" && disputas[i+1] == "R"){
        pontos1++;
    } else if(disputas[i] == "P" && disputas[i+1] == "S"){
        pontos2++;
    } else if(disputas[i] == "R" && disputas[i+1] == "S"){
        pontos1++;
    } else if(disputas[i] == "R" && disputas[i+1] == "P"){
        pontos2++;
    }
}

if(pontos1 > pontos2){
    console.log(`O jogador ${jogador1} ganhou a disputa por ${pontos1} a ${pontos2}`);
} else if (pontos2 > pontos1) {
    console.log(`O jogador ${jogador2} ganhou a disputa por ${pontos2} a ${pontos1}`);
} else {
    console.log("O jogo empatou");
}
