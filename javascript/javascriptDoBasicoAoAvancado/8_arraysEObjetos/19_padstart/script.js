//sku = código de produto (exemplo)
let sku = "34";

//Insere caracteres na frente da string
//..padStart(Quantidade total de caracteres final,
//caractere replicado)
console.log(sku.padStart(6, "0"));//Exibe 000034

let sku2 = "7348";
console.log(sku2.padStart(6, "0"));//Exibe 007348