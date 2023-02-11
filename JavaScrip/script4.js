
function evaluarLetra(caracter){
    if(caracter == 'S' || caracter =='N'){
        mensaje ="Correcto usted adivino!!!"
    }else{
        mensaje= "Incorrecto!!!"
    }
    return mensaje;
}
var letra= prompt ("Ingrese una letra" );
var caracter=  letra.toUpperCase(); 
alert( evaluarLetra(caracter));