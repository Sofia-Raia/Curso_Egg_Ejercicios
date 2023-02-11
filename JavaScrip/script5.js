function operacionesBasicas(num1,num2,operation) {
    let operationLower = operation.toLowerCase();
    let result = "";
    switch (operationLower) {
        //case 'S':
        case 's':
            result = "La suma da: "+ (num1 + num2);
            break;
        //case 'R':
        case 'r':
            result = "La resta da: "+ (num1 - num2);
            break;
        //case 'M':
        case 'm':
            result = "La multiplicación da: "+ (num1 * num2);
            break;
        //case 'D':
        case 'd':
            if (num2 === 0) {
                result = "No se puede dividir por 0!";
            } else {
                result = "La división da: "+ (num1 / num2);
            }
            break;
        default:
            result = ("El caracter ingresado no corresponde con ninguna operacion valida.");
            break;
    }
    return result;
}
do {
    var num1 = parseInt(prompt("Ingrese el primer numero"));
} while (isNaN(num1));
do {
    var num2 = parseInt(prompt("Ingrese el segundo numero"));
} while (isNaN(num2));

var option = prompt("Ingrese una opcion de opercion: Suma(s), resta(r), multiplicación(m), división(d) ");

alert(operacionesBasicas(num1,num2,option));