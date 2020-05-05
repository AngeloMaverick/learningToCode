/*
    Escreva uma função que receba um número negativo e
    retorne um número positivo;
    Dica: utilize a função Math.abs
*/

function negativeToPositive(numero){
    return Math.abs(numero);
}

let numero = parseInt(prompt("Insira um número negativo"));
console.log(negativeToPositive(numero));







