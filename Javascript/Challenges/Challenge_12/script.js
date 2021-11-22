/*
    Desafio - Árvore utópica
    As árvores utópicas  crescem de uma forma particular, em dois ciclos:

    cada primavera dobram seu tamanho
    cada verão crescem um metro

    Se Laura planta uma árvore utópica com um metro, no final do outono, qual seria sua altura depois de N ciclos?

    Alguns exemplos:

    si N = 0, sua altura será 1 metro (não cresceu nada)
    si N = 1, sua altura será de 2 metros (dobrou a altura na primavera)
    si N = 2, sua altura será de 3 metros (cresceu um metro mais no verão)
    si N = 3, sua altura será de 6 metros (dobrou a altura na primavera seguinte)
    E assim ...

    Escreva a função alturaArvoreUtopica, que utilize uma quantidade de ciclos de crescimento, e retorne a altura resultante da árvore de Laura.
*/

function alturaArvoreUtopica(N){
    if(N>0){
        let tamanho = 1;
        for(let i = 1; i<=N; i++){
            if(i%2==0){
                tamanho+=1;
            }else{
                tamanho*=2;
            }
        }
        return tamanho;
    }else{
        return 1;
    }
}

console.log(alturaArvoreUtopica(0)); //1
console.log(alturaArvoreUtopica(1)); //2
console.log(alturaArvoreUtopica(2)); //3   
console.log(alturaArvoreUtopica(3)); //6
console.log(alturaArvoreUtopica(4)); //7
console.log(alturaArvoreUtopica(5)); //14
console.log(alturaArvoreUtopica(6)); //15

//primavera = tamanho*2;
//verao = tamanho+1;
