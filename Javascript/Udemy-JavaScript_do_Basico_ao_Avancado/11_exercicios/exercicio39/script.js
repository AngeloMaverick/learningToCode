/*
    Crie uma classe que simule um carro;
    Propriedades: marca, cor, gasolina restante;
    Crie um método de dirigir o carro, que vá diminuindo a gasolina
    gradativamente;
    E um de abastecer para aumentar a gasolina quando necessário;
*/

class Carro {
    constructor(marca, cor, gasolina){
        this.marca = marca;
        this.cor = cor;
        this.gasolina = gasolina;
    }

    dirigirCarro(km){
        //5Km por litro
        let gasolinaConsumida = km * 0.2;
        if(this.gasolina >= gasolinaConsumida){
            this.gasolina -= gasolinaConsumida;
        } else {
            alert("Você não tem gasolina suficiente para essa viagem!");
        }
    }

    abastecerCarro(gas){
        this.gasolina += gas;
    }

    getCarro(){
        return `Seu ${this.marca} ${this.cor} está com [${this.gasolina}L] de gasolina!`;
    }
}
let prm1, prm2, prm3;
prm1 = prompt('Qual vai ser a marca do seu carro?');
prm2 = prompt('Qual vai ser a cor?');
prm3 = prompt('Quantos litros de gasolina iniciais ele irá ter?');
let celta = new Carro(prm1, prm2, parseInt(prm3));
let verificador = 0;

do{
    let escolha = prompt("Insira um número para escolher uma opção\n" +
                         "1. Dirigir o carro\n" +
                         "2. Abastecer o carro\n" +
                         "3. Sair do programa\n" +
                         `Gasolina: [${celta.gasolina}L]`);
    switch(escolha){
        case "1":
            let km = prompt("Quantos Km pretende dirigir?");
            celta.dirigirCarro(km);
            break;

        case "2":
            let gas = parseInt(prompt("Quantos Litros pretende abastecer?"));
            celta.abastecerCarro(gas);
            break;

        case "3":
            verificador = 1;
            break;
            
        default:
            alert("Opção Inválida!");
    }

}while(verificador === 0);



