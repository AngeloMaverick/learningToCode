/*
    Construtores são formas de instanciar uma classe em uma linguagem de programação;
    Instanciar = criar um objeto novo;
    No construtor já podemos definir propriedades;
*/

function criaCachorro(raca, patas, cor) {
    let cachorro = Object.create({});
    cachorro.raca = raca;
    cachorro.patas = patas;
    cachorro.cor = cor;
    cachorro.latir = function() {
        console.log("Au Au");
    }
    return cachorro;
}

let doberman = criaCachorro('Doberman', 4, 'preta');
console.log(doberman);
doberman.latir();
