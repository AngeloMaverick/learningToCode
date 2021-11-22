let frase = "Testando o método split";
let palavras = frase.split(" ");

//Transforma o array em uma string, o parametro é o separador
//..join(separador)
let novaFrase = palavras.join("@");
console.log(novaFrase);

console.log(palavras.join(" "));