/*
    Crie um objeto que simula um endereço de um cliente;
    Propriedades: Rua, Bairro, Cidade e Estado;
    No construtor o endereço já deve ser definido por completo;
    Crie métodos para atualizar todas as propriedades;
*/

class enderecoCliente {
    constructor(rua, bairro, cidade, estado){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    setEndereco(rua, bairro, cidade, estado){
        if(rua !== undefined){
            this.rua = rua;
        }
        if(bairro !== undefined){
            this.bairro = bairro;
        }
        if(cidade !== undefined){
            this.cidade = cidade;
        }
        if(estado !== undefined){
            this.estado = estado;
        }
    }

    getEndereco(){
        return `Rua: ${this.rua},`+
              ` Bairro: ${this.bairro},`+
              ` Cidade: ${this.cidade},`+
              ` Estado: ${this.estado}`;
    }
}

let cliente01 = new enderecoCliente("Av. Belo Horizonte, Nº 74", "Vila Ponte Nova", "São Vicente", "São Paulo");
cliente01.setEndereco("Av.São Paulo, Nº 141", "Quarentenário");
console.log(cliente01.getEndereco());