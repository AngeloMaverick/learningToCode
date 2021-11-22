/*
    Desafio - Escada
    Queremos representar uma escada com altura variável, utilizando um array de strings.
    Por exemplo, uma escada com altura 3, representaremos com o seguinte array:

    var escada3 = [
    "  #",
    " ##",
    "###"
    ]

    E uma escada com altura 5, da seguinte forma:

    var escada5 = [
    "    #",
    "   ##",
    "  ###",
    " ####",
    "#####"
    ]

    Escreva uma função escada que utilize uma altura (um número) e retorne um array que represente a escada correspondente.
*/

function escada(altura){
    let stairs = [];
    for(let i = 1; i<=altura; i++){
        let stringEscada = "";
        
        for(let j = 1; j<=(altura-i); j++){
            stringEscada+=" ";
        }
        for(let k = 1; k<=i; k++){
            stringEscada+="#";
        }
        
        stairs.push(stringEscada);
    }

    return stairs;
}

/*  
    espaço(altura - 1) + hashtag(1)
    espaço(altura - 2) + hashtag(2)
    espaço(altura - 3) + hashtag(3)
    espaço(altura - 4) + hashtag(4)
    espaço(altura - 5) + hashtag(5)
*/

console.log(escada(3));//["  #"," ##","###"]
console.log(escada(5));//["    #","   ##","  ###"," ####","#####"]
console.log(escada(6));
console.log(escada(7));
console.log(escada(8));
console.log(escada(9));


