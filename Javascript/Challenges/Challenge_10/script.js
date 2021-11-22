/*
    Desafio - Mais Menos
    Necessitamos uma função maisMenos que receba um array e retorne outro com os seguintes três números:

    1. na primeira posição, a fração de números que são positivos
    2. na segunda posição, a fração de números que são zero
    3. na última posição, a fração de números que são negativos
    
    Por exemplo, maisMenos([1, 2, 0, -1]) deveria retornar [0.5, 0.25, 0.25], devido a que há 50% de positivos, 25% de zeros, e 25% de negativos.

    Escreva a função maisMenos.
*/

function maisMenos(arrayInserido){
    let outroArray = [];
    let a = 0, b = 0, c = 0;
    for(let i = 0; i<arrayInserido.length; i++){
        if(arrayInserido[i]>0){
            a++;
        } else if (arrayInserido[i] == 0) {
            b++;
        } else {
            c++;
        }
    }

    a /= (arrayInserido.length);
    b /= (arrayInserido.length);
    c /= (arrayInserido.length);

    outroArray.push(a);
    outroArray.push(b);
    outroArray.push(c);
    
    return outroArray;
}

console.log(maisMenos([1, 2, 0, -1])); //[0.5, 0.25, 0.25]
console.log(maisMenos([1, 2, 0, -1, -3, 0]));