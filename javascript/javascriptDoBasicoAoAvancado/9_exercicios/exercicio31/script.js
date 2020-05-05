/*
    Crie dois arrays, um com mais de 5 elementos e outro com menos;
    Faça uma função que verifica o número de elementos;
    Se possuir menos que 5, imprima "Poucos elementos" no console;
    Se tiver mais, imprima "Muitos elementos";
*/
function verificarTamanho(array) {
    if(array.length < 5){
        console.log("Poucos elementos");
    } else if (array.length > 5) {
        console.log("Muitos elementos");
    }
}

let numbers = [1,2,3,4,5,6,7,8];
let alpha = ["A","B","C","D"];
verificarTamanho(numbers);
verificarTamanho(alpha);



