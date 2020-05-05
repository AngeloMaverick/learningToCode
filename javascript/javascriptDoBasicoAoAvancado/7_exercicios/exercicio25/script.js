/*
    Escreva uma função que recebe um número, e o 
    decrementa de 1 em 1 com um loop;

    Além disso imprima somente os números pares no console;
*/

function decremento(num){
    for(num; num >= 0; num--) {
        if(num%2 == 0) {
            console.log(num);
        }
    }    
}

let num = parseInt(prompt("Insira um número positivo"));
decremento(num);







