let obj = {
    rodas: 4,
    portas: 4,
    tetosolar: true,
    motor: "2.0"
}

//Desestrutura um objeto em variáveis
//Obs.: As variáveis não viram ponteiros!!!
const {rodas: vRodas, portas: vPortas, 
    tetosolar: vTetoSolar, motor: vMotor} = obj;

console.log(vRodas);
console.log(vPortas);
console.log(vMotor);
