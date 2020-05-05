/*
    O prototype do JavaScript pode ser chamado de classe;
    Pois nas outras linguagens uma Class é um molde de um objeto;
    Ou seja, podemos criar diversos objetos em cima de um prototype;
*/

let cachorro = {
    patas: 4,
    raca: 'SRD',
    latir: function() {
        console.log("Au Au");
    }
}

let labrador = Object.create(cachorro);

labrador.latir();

labrador.raca = "Labrador";

console.log(labrador.raca); //Labrador
console.log(cachorro.raca); //SRD

let pastor = Object.create(cachorro);
pastor.raca = "Pastor Alemão";
console.log(pastor.raca); //Pastor Alemão