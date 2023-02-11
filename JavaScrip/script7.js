//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.
let numLim=100;
let count=0;
let message=
function greaterNumber(num){
    if(num<=numLim){
        count+=num;
        message="Aún no se supero el limite, ingrese otro número."
    }else{
        message="Los números ingresados superaron el número limite. "
    }
    return message;

}
do {
    var numberEntered = prompt("Ingrese un numero positivo");
    var numberAsFloat = parseFloat(numberEntered)
} while (!Number.isInteger(numberAsFloat) &&  num > numLim);
alert(greaterNumber(parseInt(numberAsFloat))); 