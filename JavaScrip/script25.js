/*Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
siguiente formulario.*/
let getFormValores=()=>{
   let name= document.getElementById("name").value; 
   let surname=document.getElementById("surname").value; 
   return [name, surname];
}
console.log(getFormValores());
