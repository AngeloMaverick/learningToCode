/*
    Adicione a propriedade janelas no ônibus, com o valor de 20;
    Delete a propriedade rodas;
    Imprima a propriedade janelas no console;
*/

let onibus = {
    rodas: 8,
    limiteDePassageiros: 40,
    portas: 2
};

onibus.janelas = 20;
delete onibus.rodas;
console.log(onibus.janelas);






