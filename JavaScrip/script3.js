function revisarEdad(edad){
    var mensaje = "";
    if(edad >= 18 ){
        mensaje = "Usted es mayor de edad!"
    } else {
        mensaje = "Usted es menor de edad!"
    }
    return mensaje;
}

var edad = prompt("¿Que esdad tiene usted?");
edad = parseInt(edad)
alert(revisarEdad(edad));