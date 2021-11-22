let pessoa = {
    nome: "Angelo"
}

let pessoa2 = pessoa;

let pessoa3 = {
    nome: "Angelo"
}

console.log(pessoa == pessoa2);
console.log(pessoa3 == pessoa);
console.log(pessoa3 == pessoa2);

pessoa2.nome = "Monalisa";
console.log(pessoa.nome);

pessoa.nome = "Michele";
console.log(pessoa2.nome);
