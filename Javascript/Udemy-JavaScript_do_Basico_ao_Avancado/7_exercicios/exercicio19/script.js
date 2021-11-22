/*
    Escreva uma função que retorne um número aleatório;
    O número máximo retornado deve ser passado via parâmetro;
    Dica: utilize Math.random();
*/

function randomico(num) {
    return Math.floor(Math.random() * num) + 1; 
}

console.log(randomico(prompt("Insira o número máximo")));



