//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
let maxNum;
let minNum;
let mean=0;
let sum=0;
let count=0;
let integer;


do {
    let num=prompt("Ingrese un número entero");
    integer=evaluateNumber(num);
    if(!integer) continue;
    sum+=integer;
    count+=1;
    if(integer>maxNum || !maxNum){
        maxNum=integer;
    }
    if(integer<minNum || !minNum){
        minNum=integer;
    }

} while (integer!==0);
alert(`El máximo número es: ${maxNum}
El mínimo número es: ${minNum}
El promedio es: ${sum/count}
`)



function evaluateNumber(num){
    let num1=parseInt(num);
    if(!Number.isInteger(num1)){
        alert("El número ingresado no es ENTERO.")
        return;
    }
    return num1;
}
