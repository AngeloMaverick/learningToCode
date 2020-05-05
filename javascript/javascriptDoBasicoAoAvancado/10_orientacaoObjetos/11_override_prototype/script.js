/*
    Sempre que adicionamos uma propriedade a um objeto, é criada
    uma idêntica no Prototype;
    Podemos substituir a do prototype;
*/

class Cachorro {
    constructor(raca, cor) {
        this.raca = raca;
        this.cor = cor;
    }

    latir() {
        console.log("Au au");
    }
}

Cachorro.prototype.raca = 'SRD';
Cachorro.prototype.patas = 4;

let labrador = new Cachorro('Labrador', 'Amarelo');
console.log(labrador.patas);
labrador.latir();

//Valor default de raca está no prototype
console.log(Cachorro.prototype.raca);
console.log(labrador.raca);


