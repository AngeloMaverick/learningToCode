/*
    Em muitas linguagens temos a possibilidade de instanciar um
    objeto com new, no JS também;
*/

//Classe tem primeira letra em maiúsculo
function Cachorro(raca, patas, cor){
    this.raca = raca;
    this.patas = patas;
    this.cor = cor;
    this.uivar = function(){
        console.log("AUuuuu");
    }
}

//Instanciando um novo objeto
let husky = new Cachorro('Husky', 4, 'cinza');

husky.uivar();
console.log(husky);

