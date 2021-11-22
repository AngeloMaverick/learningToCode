/*
    Crie uma classe conta bancaria;
    Com as propriedades de saldo na conta corrente, saldo na conta
    poupança e juros da poupança;
    Crie os métodos de depósito e saque, também um método para
    transferir dinheiro da poupança para a corrente;
    Além disso crie uma conta especial que herda da conta normal;
    Na conta especial os juros são dobrados da conta normal;
*/

class ContaBancaria {
    constructor(corrente, poupanca, jPoupanca){
        this.corrente = corrente;
        this.poupanca = poupanca;
        this.jPoupanca = jPoupanca;
    }
    deposito(conta, valor){
        if(conta === "corrente"){
            this.corrente += valor;

        } else if (conta === "poupanca"){
            this.poupanca += valor;
        }
    }
    saque(conta, valor){
        if(conta === "corrente"){
            this.corrente -= valor;

        } else if (conta === "poupanca"){
            this.poupanca -= valor;
        }
    }
    transferencia(valor){
        //poupança --> corrente
        this.poupanca -= valor;
        this.corrente += valor;
    }
    jurosDeAniversario(){
        let juros = (this.poupanca * this.jPoupanca) / 100;
        this.poupanca += juros;
    }
}

class ContaEspecial extends ContaBancaria {
    constructor(corrente, poupanca, jPoupanca){
        super(corrente, poupanca, jPoupanca*2);
    }
}

let Conta001 = new ContaBancaria(1000, 1000, 10);

Conta001.deposito("corrente", 1000);
console.log(Conta001);
Conta001.deposito("poupanca", 1000);
console.log(Conta001);

Conta001.saque("corrente", 1000);
console.log(Conta001);
Conta001.saque("poupanca", 1000);
console.log(Conta001);

Conta001.jurosDeAniversario();
console.log(Conta001);

Conta001.transferencia(1000);
console.log(Conta001);

let contaEspecial = new ContaEspecial(1000, 1000, 10);
console.log(contaEspecial);

contaEspecial.saque("corrente", 50);
console.log(contaEspecial);

contaEspecial.jurosDeAniversario();
console.log(contaEspecial);






