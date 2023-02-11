/*Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a
elección.*/
let message= prompt("Ingrese un mensaje");
let showMessage= ()=> alert(message);
document.getElementById("boton").addEventListener("click",showMessage);