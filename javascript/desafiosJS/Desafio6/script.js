/*
    Desafio #6

    Exiba todos os números pares e ímpares dentro do array abaixo:

    var numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];

    Exemplo de saída:
    Números pares: 1, 1, 1, 1, 1
    Números ímpares: 1, 1, 1, 1
*/

var numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];
let numerosPares = new Array();
let numerosImpares = new Array();
let j = 0;
let k = 0;

for(let i = 0; i < numeros.length; i++){
    if(numeros[i]%2==0){
        numerosPares[j] = numeros[i];
        j++;
    }else{
        numerosImpares[k] = numeros[i];
        k++;
    }
}

console.log(`Números pares: ${numerosPares.join(", ")}`);
console.log(`Números ímpares: ${numerosImpares.join(", ")}`);