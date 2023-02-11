/*Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
radio del círculo lo proporcionará el usuario.*/
let circle ={
    radio:""
}
let data= prompt("Ingrese el radio del circulo, para calcular el area y perímetro.")
let area=(data)=>{
    let area1=Math.PI* Math.pow(data,2);
    return area1;
}
let perimeter=(data)=>{
    let perimeter1= 2* Math.PI*data;
    return perimeter1;
}
let areaR= area(data);
let perimeterR=perimeter(data);
alert(`El area es: ${areaR} y el perimetro es: ${perimeterR}`);