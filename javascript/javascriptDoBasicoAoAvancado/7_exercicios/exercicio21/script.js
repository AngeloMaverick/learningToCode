/*
    Escreva uma função que detecta o tipo de dado passado;
    Verifique se é um: number, boolean ou string;
    E retorne uma mensagem para cada tipo;
    Execute uma função para cada caso;
*/

function typeDetect(dado){
    if(typeof dado == "number"){
        return `O dado ${dado} é do tipo NUMBER`;
    }else if(typeof dado == "boolean"){
        return `O dado ${dado} é do tipo BOOLEAN`;
    }else if(typeof dado == "string"){
        return `O dado ${dado} é do tipo STRING`;
    }
}

console.log(typeDetect(22));
console.log(typeDetect(true));
console.log(typeDetect("Angelo"));







