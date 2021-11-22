let pessoa = {
    nome: "Angelo",
    idade: 22,
    profissao: "Programador"
}

console.log(pessoa.nome);

//Deletando propriedade
delete pessoa.nome;

console.log(pessoa.nome);
console.log(pessoa);

//Criando nova propriedade não existente
pessoa.casado = false;

console.log(pessoa.casado);
console.log(pessoa);