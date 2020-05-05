/*
    Desafio #4

    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    • Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:

    Fatorial de : 5
    
    5! = 5.4.3.2.1 = 120
*/

let fatorial = prompt("Insira um número para descobrir sue fatorial:");
let resultado = 1;
let multiplicacao = "";

for(let i = fatorial; i>=2; i--){
    resultado*=i;
    multiplicacao+=`${i}.`;
}
multiplicacao+="1";

console.log(`Fatorial de : ${fatorial}\n
${fatorial}! = ${multiplicacao} = ${resultado}`);