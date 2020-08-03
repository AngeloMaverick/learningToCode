/*
    Desafio - Professora Furiosa
    Uma professora de programação, cansada de que os estudantes cheguem tarde, decidiu que vai cancelar a aula se há poucos presentes.

    Ela representa a entrada dos estudantes como um array de tempos de chegada tarde, em minutos. Por exemplo, se um estudante chegou 10 minutos atrasado, outro 5 minutos antes da hora, outro com 3 minutos de atraso, e outro pontual, poderá representar assim:

    var alunosDaSegunda = [10, -5, 3, 0];
    Com essa informação e a quantidade mínima de estudantes para que suceda o curso, a professora quer saber se a aula acontecerá. Por exemplo, supondo que a quantidade mínima de estudantes para que a aula aconteça é de 2 alunos, então o curso da segunda-feira se realizará, porque houve um estudante que foi pontual e um estudante que chegou cedo.

    acontece(alunosDaSegunda, 2)
    true
    Mas se a quantidade mínima fosse 3, a aula não aconteceria:

    acontece(alunosDaSegunda, 3)
    false
    Escreva as seguintes funções: 1. acontece, que diz se a aula sucederá de acordo com o array dos estudantes que entraram. 2. aberturas, que utiliza um array com os arrays dos estudantes que entraram nos outros dias, e a quantidade mínima de estudantes, e diga quais os dias em que as aulas aconteceram e quais não. Por exemplo:

    aberturas([alunosDaSegunda, alunosDaTerça, alunosDaQuarta], 2)
    [true, false, false]
*/

function acontece(horaAlunos, quantMin){
    let quant = 0;
    for(let i = 0; i<horaAlunos.length; i++){
        if(horaAlunos[i]<=0){
            quant++;
        }
    }
    if(quant>=quantMin){
        return true;
    }else{
        return false;
    }
}

function aberturas(arrayDias, quantMin){
    let arrayFinal = [];
    let i;

    for(i = 0; i<arrayDias.length; i++){
        let quant = 0;

        for(let j = 0; j<arrayDias[i].length; j++){
            if(arrayDias[i][j]<=0){
                quant++;
            }
        }
        
        if(quant>=quantMin){
            arrayFinal.push(true);
        }else{
            arrayFinal.push(false);
        }
    }
    return arrayFinal;        
}
    
//Testes
var alunosDaSegunda = [10, -5, 3, 0];
var alunosDaTerca = [11, -8, -9, -1];
var alunosDaQuarta = [1, 2, 3, 4];
var arrayDias = [alunosDaSegunda, alunosDaTerca, alunosDaQuarta];
console.log(acontece(alunosDaSegunda, 2));
console.log(aberturas(arrayDias, 3));

