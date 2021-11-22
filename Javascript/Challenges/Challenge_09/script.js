/*
    Desafio - Fatorial
    Escreva uma função fatorial, que calcule o fatorial de um número.
*/

function fatorial(number){
    if(number > 0){
        let resultado = 1;

        for(let i = number; i>=2; i--){
            resultado*=i;
        }

        return resultado;
    } else {
        return 1;
    }    
}

console.log(fatorial(0));//1
console.log(fatorial(1));//1
console.log(fatorial(2));//2
console.log(fatorial(3));//6
console.log(fatorial(4));//24
console.log(fatorial(5));//120
console.log(fatorial(6));//720
console.log(fatorial(7));//5040



