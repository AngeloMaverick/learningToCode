const pessoa = {
    maos: 2
}

console.log(Object.getPrototypeOf(pessoa)); //Exibe o prototype (que no caso é o Object)
console.log(Object.getPrototypeOf(pessoa) === Object.prototype); //Verifica prototype
console.log(pessoa.hasOwnProperty('maos')); //Verifica se contém esta propriedade

//pessoa se torna o prototype de pessoaNova
//pessoaNova herda as propriedades de pessoa, mas não adquire realmente para si
const pessoaNova = Object.create(pessoa);
console.log(pessoaNova.maos);

//hadOwnProperty é um método do Object(Pai dos Objetos)
console.log(pessoaNova.hasOwnProperty('maos')); //false

//Verifica se é o prototype (Pai direto)
console.log(Object.getPrototypeOf(pessoaNova) === pessoa); //true
console.log(Object.getPrototypeOf(pessoaNova) === Object.prototype); //false