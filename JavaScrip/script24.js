/*Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
circulo y lo muestre en el HTML.*/
let calculatePerimeterArea=()=>{
    let radius = document.getElementById("radius").value;
    var  pi =Math.PI ;
    var area = pi * radius;
    var perimetro = 2 * pi * radius;
    let message= "<p>El area es de "+ area + " y el perimetro es de "+ perimetro+"</p>";
    let messageDiv = document.getElementById("msg");
    messageDiv.innerHTML = message;
}

document.getElementById("button").addEventListener("click",calculatePerimeterArea);