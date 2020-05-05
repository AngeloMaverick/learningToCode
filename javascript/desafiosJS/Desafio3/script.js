/*
    Desafio #3

    Uma empresa de pesquisas precisa realizar a seguinte enquete:
    
    "Qual o melhor Sistema Operacional para uso em servidores?"

    As possíveis respostas são:
    1- Windows Server
    2- Unix
    3- Linux
    4- Netware
    5- Mac OS
    6- Outro

    Você foi contratado para desenvolver um programa que leia o resultado da enquete e informe ao final o resultado da mesma. O programa deverá ler os valores até ser informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma das opções devem ser armazenados num vetor. Após os dados terem sido completamente informados, o programa deverá calcular a percentual de cada um dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado pela empresa, e é o seguinte:

    Sistema Operacional     Votos     % 
    -------------------     -----     ----
    Windows Server           1500      17%
    Unix                     3500      40%
    Linux                    3000      34%
    Netware                   500       5%
    Mac OS                    150       2%
    Outro                     150       2%
    -------------------     -----
    Total                    8800

    O Sistema Operacional mais votado foi o Unix, com 3500 votos, correspondendo a 40% dos votos.
*/
let escolha;
//Criando um array ilimitado
let bancoDeDados = new Array();

//Zerando as posições que serão utilizadas
for(let i = 0; i <= 5; i++){
    bancoDeDados[i] = 0;
}

/* DADOS DE TESTE
bancoDeDados[0] = 1500;
bancoDeDados[1] = 3500;
bancoDeDados[2] = 3000;
bancoDeDados[3] =  500;
bancoDeDados[4] =  150;
bancoDeDados[5] =  150;
*/

do{
    escolha = prompt(`Qual o melhor Sistema Operacional para uso em servidores?

1- Windows Server
2- Unix
3- Linux
4- Netware
5- Mac OS
6- Outro`);

    switch (escolha){
        case "1":
            bancoDeDados[0]++;
            break;
        case "2":
            bancoDeDados[1]++;
            break;
        case "3":
            bancoDeDados[2]++;
            break;
        case "4":
            bancoDeDados[3]++;
            break;
        case "5":
            bancoDeDados[4]++;
            break;
        case "6":
            bancoDeDados[5]++;
            break;
        case "0":
            //Exibir resultado final
            break;
        default:
            alert("Você digitou uma opção inválida!");
    }
}while(escolha!=0);

let total = 0;
//Somando todos os votos
for(let i = 0; i <= 5; i++){
    total += bancoDeDados[i];
}

// ([i]*100)/total
let porcentagem = new Array();

//Calculando as porcentagens
for(let i = 0; i <= 5; i++){
    porcentagem[i] = ((bancoDeDados[i]*100)/total).toFixed(0);
}

//Mais votado
let maior = Math.max.apply(null, bancoDeDados);
let nomeMaior;
let porcentagemMaior;

if(maior == bancoDeDados[0]){
    nomeMaior = "Windows Server";
    porcentagemMaior = porcentagem[0];

}else if(maior == bancoDeDados[1]){
    nomeMaior = "Unix";
    porcentagemMaior = porcentagem[1];

}else if(maior == bancoDeDados[2]){
    nomeMaior = "Linux";
    porcentagemMaior = porcentagem[2];

}else if(maior == bancoDeDados[3]){
    nomeMaior = "Netware";
    porcentagemMaior = porcentagem[3];

}else if(maior == bancoDeDados[4]){
    nomeMaior = "Mac OS";
    porcentagemMaior = porcentagem[4];

}else if(maior == bancoDeDados[5]){
    nomeMaior = "Outro";
    porcentagemMaior = porcentagem[5];
}

//Exibição UNIFORME
total = (total.toString()).padStart(5, " ");
for(let i = 0; i <= 5; i++){
    bancoDeDados[i] = (bancoDeDados[i].toString()).padStart(5, " ");
}
for(let i = 0; i <= 5; i++){
    porcentagem[i] = (porcentagem[i].toString()).padStart(3, " ");
}


console.log(`Sistema Operacional     Votos     % 
-------------------     -----     ----
Windows Server          ${bancoDeDados[0]}     ${porcentagem[0]}%
Unix                    ${bancoDeDados[1]}     ${porcentagem[1]}%
Linux                   ${bancoDeDados[2]}     ${porcentagem[2]}%
Netware                 ${bancoDeDados[3]}     ${porcentagem[3]}%
Mac OS                  ${bancoDeDados[4]}     ${porcentagem[4]}%
Outro                   ${bancoDeDados[5]}     ${porcentagem[5]}%
-------------------     -----
Total                   ${total}

O Sistema Operacional mais votado foi o ${nomeMaior}, com ${maior} votos, correspondendo a ${porcentagemMaior}% dos votos.`);
