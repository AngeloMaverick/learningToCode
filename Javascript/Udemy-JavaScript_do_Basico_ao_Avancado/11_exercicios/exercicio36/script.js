/*
    Crie uma classe que simula uma conta no banco (utilize a forma que preferir);
    Deve conter a propriedade saldo;
    E os métodos deposito e saque;
    Teste os métodos;
*/

class ContaBanco {
    constructor(valor){
        this.saldo = valor;
    }
    deposito(valor){
        this.saldo += valor;
    }
    saque(valor){
        this.saldo -= valor;
    }
}

let minhaConta = new ContaBanco(0);
minhaConta.deposito(1000);
minhaConta.saque(300);
console.log(minhaConta.saldo);



