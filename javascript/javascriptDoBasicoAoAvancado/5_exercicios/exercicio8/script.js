/*
    Crie uma constante com o seu nome como valor;
    Depois uma estrutura if que verifica se o seu
    nome é o que está na constante;
    
    Se estiver, emita uma mensagem de saudação
    com console.log();
*/

const nome = prompt("Qual é o seu nome?");

if(nome == "Angelo"){
    console.log("Bom dia Angelo!");
}else{
   console.log(`Você não é o Angelo! Você é ${nome}!`) 
}


