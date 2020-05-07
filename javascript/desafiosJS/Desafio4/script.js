/*
    Desafio #4

    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    • Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:

    Fatorial de : 5
    
    5! = 5.4.3.2.1 = 120
*/

let fatorial = prompt("Insira um número para descobrir sue fatorial:");
let multiplicacao = new Array();
let resultado = 1;

for(let i = fatorial; i>=2; i--){
    resultado*=i;
}

for(let i = fatorial; i>0; i--){
    multiplicacao[i-1]=i;
}

multiplicacao = multiplicacao.reverse();

console.log(`Fatorial de : ${fatorial}\n
${fatorial}! = ${multiplicacao.join(".")} = ${resultado}`);