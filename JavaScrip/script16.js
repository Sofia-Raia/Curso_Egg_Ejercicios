//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
//y los muestre por pantalla.

let arr=[];
let arr1=[];
let fillVector1= (arr,arr1)=>{
    for (let index = 0; index < 5; index++) {
        let num= Math.random()*10;
        arr.push(num);
        let num1= Math.random()*10;
        arr1.push(num1);
    }
    alert(`Arreglo 1: [${arr}]`);
    alert(`[${arr1}]`);
}
fillVector1(arr,arr1);