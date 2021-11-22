/*
    Desafio - Produto
    Necessitamos uma função produto que receba um array de números e retorne o produto: o resultado de multiplicar todos os elementos entre si.

    Por exemplo, produto([1, 4, 7]) deve retornar 28, que é 1 * 4 * 7.

    Escreva a função produto
*/

function produto(listArray){
    let resultado = 1;
    for(let i = 0; i<listArray.length; i++){
        resultado*=listArray[i];
    }
    return resultado;
}

console.log(produto([1, 4, 7])); //28
console.log(produto([2, 7, 8, 9, 0])); //0
console.log(produto([2, 7, 0, 9, 48])); //0
console.log(produto([2, 1, 1, 2, 1, 1, 1, 2])); //8
console.log(produto([2, 7, 1]));


