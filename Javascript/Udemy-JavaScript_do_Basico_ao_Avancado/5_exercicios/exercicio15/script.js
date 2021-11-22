/*
    Verifique se o número é primo!

    Um número primo, é um número natural,
    maior que 1 e apenas divisível por si
    e por 1;
*/

let n1 = prompt("Insira um número");
let x = true;

if(n1 > 1){
    for(let i = 2; i < n1; i++){
        if(n1%i == 0){
            console.log("Não é primo!");
            x = false;
            break;
        }
    }
}else{
    console.log("Não é primo!");
    x = false;
}

if(x == true){
    console.log("Esse número é primo!")
}


