/*
    Crie um objeto calculadora;
    Que tem os seguintes métodos: somar, subtrair, multiplicar e dividir;
    Os métodos só devem aceitar dois parâmetros;
    Utilize cada um dos métodos e imprima os valores no console;
*/

let calculadora = {
    somar(a, b){
        return a + b;
    },
    subtrair(a, b){
        return a - b;
    },
    multiplicar(a, b){
        return a * b;
    },
    dividir(a, b){
        return a / b;
    }
}

console.log(calculadora.somar(2, 2));
console.log(calculadora.subtrair(2, 2));
console.log(calculadora.multiplicar(2, 2));
console.log(calculadora.dividir(2, 2));








