/*
    Desafio #2

    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

    --------------------------------------
    | CODIGO | ESPECIFICAÇÃO   | PREÇO   |
    --------------------------------------
    | 1      | Cachorro Quente | R$ 4.00 |
    --------------------------------------
    | 2      | X-Salada        | R$ 4.50 |
    --------------------------------------
    | 3      | X-Bacon         | R$ 5.00 |
    --------------------------------------
    | 4      | Torrada simples | R$ 2.00 |
    --------------------------------------
    | 5      | Refrigerante    | R$ 1.50 |
    --------------------------------------

    A entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme a tabela acima.

    A saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
    
    Formato de entrada:
    2 3

    Formato de saída:
    Total: R$ 13,50
*/

let codQuant = prompt("Insira o código do item e a quantidade desejada separado por um espaço!");
let preco;

switch (codQuant[0]) {
    case "1":
        preco = 4;
        break;
    case "2":
        preco = 4.5;
        break;
    case "3":
        preco = 5;
        break;
    case "4":
        preco = 2;
        break;
    case "5":
        preco = 1.5;
}

//..toFixed(quantidade de números após a vírgula)
//parseInt(Transforma o dado em um número inteiro)
preco = (preco*parseInt(codQuant[2])).toFixed(2);

//..replace('caractere a ser retirado', 'caractere a ser colocado no lugar')
console.log(`Total: R$ ${preco.replace('.',',')}`);