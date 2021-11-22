/*
    Além de propriedades, podemos criar a classe base já com métodos;
    Basta definir ao prototype o método desejado;
*/

function Cachorro(raca, patas, cor) {
    this.raca = raca;
    this.patas = patas;
    this.cor = cor;
}

//É bom deixar as propriedades na Classe
//e os métodos no Prototype
Cachorro.prototype.uivar = function() {
    console.log("Auuuu");
}
Cachorro.prototype.latir = function() {
    console.log("AU au");
}

let husky = new Cachorro('Husky', 4, 'cinza');
husky.uivar();
husky.latir();



