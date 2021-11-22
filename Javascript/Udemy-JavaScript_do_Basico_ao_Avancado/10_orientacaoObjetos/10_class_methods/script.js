/*
    Não podemos adicionar propriedades na classe, só via prototype;
    A classe só aceita métodos;
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

Cachorro.prototype.patas = 4;

let labrador = new Cachorro('Labrador', 'Amarelo');
console.log(labrador.patas);
labrador.latir();