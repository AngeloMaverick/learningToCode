let pessoa = {
    "nome" : "Matheus",
    "idade" : 28,
    "profissao" : "Programador",
    "hobbies" : ["Video game", "Leitura", "Correr"]
}

//Transforma um Objeto JSON em uma String
let pessoaTexto = JSON.stringify(pessoa);
console.log(pessoaTexto);

//Impossível acessar as propriedades como String!!!
//console.log(pessoaTexto.nome); 

//Transforma uma String em um Objeto JSON
let pessoaJSON = JSON.parse(pessoaTexto);
console.log(pessoaJSON);
console.log(pessoaJSON.hobbies[0]);


