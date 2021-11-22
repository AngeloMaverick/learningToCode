let nome = prompt("Qual o seu nome?");

if(nome != undefined && nome == "Monalisa") {
    console.log("Nome está definido");
}else if(nome == "Angelo" && nome.length > 5) {
    console.log("O nome é Angelo");
}else{
    console.log("Não é Angelo!");
}

if(1>3){
    console.log("Teste A");
}else if(1 == 1){
    console.log("Teste B");
}