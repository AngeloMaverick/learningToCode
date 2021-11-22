/*
    Escreva uma função que receba dois números, o primeiro
    é a base e o segundo a potência;
    
    Depois faça essa operação e retorne o resultado;
    Por exemplo: 3, 2 = 9
*/

function power(base, potencia){
    return Math.pow(base, potencia);
    //return base ** potencia;
}

let base = parseInt(prompt("Insira a base:"));
let potencia = parseInt(prompt("Insira o expoente:"));

console.log(power(base, potencia));







