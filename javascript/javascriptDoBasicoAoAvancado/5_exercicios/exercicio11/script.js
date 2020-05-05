/*
    Faça uma estrutura if/else para verificar se
    um usuário pode dirigir;

    Armazene em variáveis algumas informações
    sobre o usuário: idade, se tem CNH

    Se a idade for maior que 18 e não possuir
    CNH, exiba uma mensagem;

    Se a idade for maior que 18 e tem CNH, exiba
    uma mensagem;

    Se não tiver 18 nem CNH, exiba outra mensagem;
*/

let idade = prompt("Qual a sua idade?");
let CNH = prompt("Você tem CNH? S/N")

switch(CNH){
    case "S", "s":
        CNH = true;
        break;
    case "N", "n":
        CNH = false;
}

if(idade>=18 && CNH==false){
    console.log("Você não tem carteira de habilitação!");
}else if(idade>=18 && CNH==true){
    console.log("Você está apto!");
}else{
    console.log("Você é menor de 18 anos!");
}




