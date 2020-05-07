/*
    Desafio #5

    {
        "funcionarios":[
            {
                "id":0,
                "nome":"Marcelo",
                "sobrenome":"Silva",
                "salario":3200.00,
                "area":"SM"
            },
            {
                "id":1,
                "nome":"Washington",
                "sobrenome":"Ramos",
                "salario":2700.00,
                "area":"UD"
            },
            {
                "id":2,
                "nome":"Sergio",
                "sobrenome":"Pinheiro",
                "salario":2450.00,
                "area":"SD"
            },
            {
                "id":3,
                "nome":"Bernardo",
                "sobrenome":"Costa",
                "salario":3700.00,
                "area":"SM"
            },
            {
                "id":4,
                "nome":"Cleverton",
                "sobrenome":"Farias",
                "salario":2750.00,
                "area":"SD"
            },
            {
                "id":5,
                "nome":"Abraão",
                "sobrenome":"Campos",
                "salario":2550.00,
                "area":"SD"
            },
            {
                "id":6,
                "nome":"Letícia",
                "sobrenome":"Farias",
                "salario":2450.00,
                "area":"UD"
            },
            {
                "id":7,
                "nome":"Fernando",
                "sobrenome":"Ramos",
                "salario":2450.00,
                "area":"SD"
            },
            {
                "id":8,
                "nome":"Marcelo",
                "sobrenome":"Farias",
                "salario":2550.00,
                "area":"UD"
            },
            {
                "id":9,
                "nome":"Fabio",
                "sobrenome":"Souza",
                "salario":2750.00,
                "area":"SD"
            },
            {
                "id":10,
                "nome":"Clederson",
                "sobrenome":"Oliveira",
                "salario":2500.00,
                "area":"SD"
            }
        ],
        "areas":[
            {
                "codigo":"SD",
                "nome":"Desenvolvimento de Software"
            },
            {
                "codigo":"SM",
                "nome":"Gerenciamento de Software"
            },
            {
                "codigo":"UD",
                "nome":"Designer de UI/UX"
            }
        ]
    }

    A) Quem mais recebe e quem menos recebe na empresa e a média salarial da empresa.

    B) Área(s) com o maior e menor número de funcionários.
*/

let dataBase = {
    "funcionarios":[
        {
            "id":0,
            "nome":"Marcelo",
            "sobrenome":"Silva",
            "salario":3200.00,
            "area":"SM"
        },
        {
            "id":1,
            "nome":"Washington",
            "sobrenome":"Ramos",
            "salario":2700.00,
            "area":"UD"
        },
        {
            "id":2,
            "nome":"Sergio",
            "sobrenome":"Pinheiro",
            "salario":2450.00,
            "area":"SD"
        },
        {
            "id":3,
            "nome":"Bernardo",
            "sobrenome":"Costa",
            "salario":3700.00,
            "area":"SM"
        },
        {
            "id":4,
            "nome":"Cleverton",
            "sobrenome":"Farias",
            "salario":2750.00,
            "area":"SD"
        },
        {
            "id":5,
            "nome":"Abraão",
            "sobrenome":"Campos",
            "salario":2550.00,
            "area":"SD"
        },
        {
            "id":6,
            "nome":"Letícia",
            "sobrenome":"Farias",
            "salario":2450.00,
            "area":"UD"
        },
        {
            "id":7,
            "nome":"Fernando",
            "sobrenome":"Ramos",
            "salario":2450.00,
            "area":"SD"
        },
        {
            "id":8,
            "nome":"Marcelo",
            "sobrenome":"Farias",
            "salario":2550.00,
            "area":"UD"
        },
        {
            "id":9,
            "nome":"Fabio",
            "sobrenome":"Souza",
            "salario":2750.00,
            "area":"SD"
        },
        {
            "id":10,
            "nome":"Clederson",
            "sobrenome":"Oliveira",
            "salario":2500.00,
            "area":"SD"
        }
    ],
    "areas":[
        {
            "codigo":"SD",
            "nome":"Desenvolvimento de Software"
        },
        {
            "codigo":"SM",
            "nome":"Gerenciamento de Software"
        },
        {
            "codigo":"UD",
            "nome":"Designer de UI/UX"
        }
    ]
};

//console.log(dataBase.funcionarios);
//console.log(dataBase.funcionarios[0]);
//console.log(dataBase.funcionarios[0].salario);
let maiorSalario = 0;
let maiorSalarioNome = new Array();

let menorSalario = 0;
let menorSalarioNome = new Array();

let mediaSalario = 0;

//Verificando o maior e menor salário e média
for(let i = 0; i<=10; i++){
    let salarioEmQuestao = dataBase.funcionarios[i].salario;
    let nomeCompletoEmQuestao = dataBase.funcionarios[i].nome + " " + dataBase.funcionarios[i].sobrenome;
    
    if(i === 0){
        maiorSalario = salarioEmQuestao;
        maiorSalarioNome[0] = nomeCompletoEmQuestao;
        menorSalario = salarioEmQuestao;
        menorSalarioNome[0] = nomeCompletoEmQuestao;

    }else{
        if(salarioEmQuestao > maiorSalario){
            maiorSalario = salarioEmQuestao;
            maiorSalarioNome[0] = nomeCompletoEmQuestao;
        }

        if (salarioEmQuestao < menorSalario){
            menorSalario = salarioEmQuestao;
            menorSalarioNome[0] = nomeCompletoEmQuestao;
        }
    }

    mediaSalario += salarioEmQuestao;
}
mediaSalario = mediaSalario/11;

//Verificando se há outras pessoas com maior e menor salário
let j = 1, k = 1;

for(let i = 0; i<=10; i++){
    let salarioEmQuestao = dataBase.funcionarios[i].salario;
    let nomeCompletoEmQuestao = dataBase.funcionarios[i].nome + " " + dataBase.funcionarios[i].sobrenome;
    
    if(maiorSalario === salarioEmQuestao){
        if(maiorSalarioNome[0] !== nomeCompletoEmQuestao){
            maiorSalarioNome[j] = nomeCompletoEmQuestao;
            j++;
        } else {
            continue;
        }
    }

    if(menorSalario === salarioEmQuestao){
        if(menorSalarioNome[0] !== nomeCompletoEmQuestao){
            menorSalarioNome[k] = nomeCompletoEmQuestao;
            k++;
        } else {
            continue;
        }
    }
}

//Formulando a Exibição
let valorMonetario = (valor) => {
    valor = (valor.toFixed(2)).replace(".",",");
    return valor;
};

maiorSalario = valorMonetario(maiorSalario);
menorSalario = valorMonetario(menorSalario);
mediaSalario = valorMonetario(mediaSalario);
maiorSalarioNome = maiorSalarioNome.join(", ");
menorSalarioNome = menorSalarioNome.join(", ");

console.log(`Quem mais recebe: ${maiorSalarioNome}(R$${maiorSalario}) 
Quem menos recebe: ${menorSalarioNome}(R$${menorSalario})
Média salarial da empresa: R$${mediaSalario}`);

/* ********************************************************************************************************* */
//console.log(dataBase.funcionarios);
//console.log(dataBase.funcionarios[0]);
//console.log(dataBase.funcionarios[0].area);

//console.log(dataBase.areas);
//console.log(dataBase.areas[0]);
//console.log(dataBase.areas[0].codigo);

let maiorArea;
let menorArea;
let areaSoma = [0, 0, 0];


//Fazendo os cálculos
for(let i = 0; i<=10; i++){
    let areaEmQuestao = dataBase.funcionarios[i].area;

    switch (areaEmQuestao){
        case "SD":
            areaSoma[0]++;
            break;

        case "SM":
            areaSoma[1]++;
            break;

        case "UD":
            areaSoma[2]++;
    }   
}

//Verificando a maior e menor area
if(areaSoma[0] > areaSoma[1] && areaSoma[0] > areaSoma[2]){
    maiorArea = "SD";
} else if (areaSoma[1] > areaSoma[0] && areaSoma[1] > areaSoma[2]) {
    maiorArea = "SM";
} else if (areaSoma[2] > areaSoma[0] && areaSoma[2] > areaSoma[1]) {
    maiorArea = "UD";
}

if(areaSoma[0] < areaSoma[1] && areaSoma[0] < areaSoma[2]){
    menorArea = "SD";
} else if (areaSoma[1] < areaSoma[0] && areaSoma[1] < areaSoma[2]) {
    menorArea = "SM";
} else if (areaSoma[2] < areaSoma[0] && areaSoma[2] < areaSoma[1]) {
    menorArea = "UD";
}

console.log(`Área com maior número de funcionários: ${maiorArea}(${areaSoma[0]})
Área com menor número de funcionários: ${menorArea}(${areaSoma[1]})`);