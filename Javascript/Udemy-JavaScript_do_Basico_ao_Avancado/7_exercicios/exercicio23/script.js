/*
    Escreva uma função que recebe uma string;
    Se o texto conter mais de 10 caracteres imprima
    "Texto muito longo";

    Se conter menos, imprima "Texto dentro do limite";
*/

function checagemString(texto){
    if(texto.length > 10){
        return "Texto muito longo";
    }else{
        return "Texto dentro do limite";
    }
}

let texto = prompt("Digite algo");
console.log(checagemString(texto));







