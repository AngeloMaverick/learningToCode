let nums = [0,1,2,3,4,5,6,7,8,9];

//Exibe um array com os elementos das 
//posições inseridas 
//..slice(posição inicial, até posição final - 1)
console.log(nums.slice(4,5)); //Exibe 4
console.log(nums.slice(4,6)); //Exibe 4 e 5

//Caso não inserir o segundo parametro
//Irá exibir um array com todos os elementos 
//apartir do elemento da posição inserida
console.log(nums.slice(2)); //Exibe 2 a 9

//Caso insira parametro negativo
//Irá mostrar sempre os X últimos elementos
console.log(nums.slice(-2)); //Exibe 8 e 9

//Neste caso, irá exibir um array
//Apartir do elemento da posição X até
//a (última posição - Y)
console.log(nums.slice(3,-2)); // Exibe 3 a 7
