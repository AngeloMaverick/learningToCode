/*
    Escreva uma função que recebe a idade de uma pessoa;
    Se ela tem mais de 18 anos ela pode entrar na auto escola,
    imprima uma mensagem informando isso;

    Se ela tem menos, ela não pode, imprima outra mensagem com
    este aviso;

    Execute a função nos dois casos;
*/

function permissaoHabilitacao(idade) {
    if(idade >= 18) {
        console.log("Você pode tirar habilitação de motorista!");
    } else {
        console.log("Você é menor de idade!");
    }

}

//let idade = parseInt(prompt("Quantos anos você tem?"));
//permissaoHabilitacao(idade);

permissaoHabilitacao(22);
permissaoHabilitacao(18);
permissaoHabilitacao(39);
permissaoHabilitacao(9);
permissaoHabilitacao(17);





