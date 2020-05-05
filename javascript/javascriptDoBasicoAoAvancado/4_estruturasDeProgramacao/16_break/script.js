let nome = "Angelo";

for(let i = 0; i < 10; i++){

    if(i==3){
        nome = "Monalisa";
    }

    if(i==5 && nome == "Monalisa") {
        console.log("O nome é Monalisa, pode parar");
        break;
    }

    console.log(i);
}