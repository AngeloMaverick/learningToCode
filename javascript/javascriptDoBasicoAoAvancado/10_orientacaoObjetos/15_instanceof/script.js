/*
    Instanceof operator
    Podemos verificar quem é o pai do objeto utilizando o instanceof;
*/

class Mamifero {
    constructor(patas) {
        this.patas = patas;
    }
}

let coiote = new Mamifero(4);
console.log(coiote.patas);

class Cachorro extends Mamifero {
    constructor(patas, raca) {
        super(patas, patas);
        this.raca = raca;
    }

    latir(){
        console.log("Au au");
    }
}

let pug = new Cachorro(4, "Pug");
console.log(pug.patas);
pug.latir();

console.log(pug instanceof Mamifero); //true
console.log(coiote instanceof Mamifero); //true
console.log(new Cachorro instanceof Mamifero); //true


