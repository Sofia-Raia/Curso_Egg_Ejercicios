function analizarNumero(number){
    let message="";
    if(number === 0){
        message= "El número ingresado no es PAR ni IMPAR!";
    }else if(number % 2 ==0){
        message= "El número ingresado es PAR!";
    }else{
        message= "El número ingresado es IMPAR!";
    }
    return message;
}

do {
    var numberEntered = prompt("Ingrese un número ENTERO.");
    var numberAsFloat = parseFloat(numberEntered)
} while (!Number.isInteger(numberAsFloat));
alert(analizarNumero(parseInt(numberAsFloat))); 