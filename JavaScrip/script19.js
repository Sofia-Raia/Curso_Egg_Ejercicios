/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
de 20.*/
let arrA=[];
let arrB=[];
let num="";

let showArrA=(arrA)=>{                         // LLENA EL ARREGLO A CON AEATORIOS.
    for (let index = 0; index < 50; index++) {
        num= Math.random()*10;
        num= Math.round(num);
        arrA.push(num);
    }
    
    alert(`Array A : ${arrA}`);
}
showArrA(arrA);

let sortArray=(arrA)=>{                // ORDENA EL ARREGLO A DE MENOS A MAYOR.
    function compareNumeric(a, b) {
        if (a > b) return 1;
        if (a == b) return 0;
        if (a < b) return -1;
    }
    arrA.sort(compareNumeric);
    alert(`El array A ordenado: ${arrA}`);
}
sortArray(arrA);

let fillArrB=(arrA)=>{                           //LLENO Y MUESTRO ARREGLO B.
    for (let index = 0; index < 10; index++) {
        arrB.push(arrA[index]);
    }
    for (let index = 0; index < 10; index++) {
        arrB.push(0.5);
        
    }
    alert(`Array B: ${arrB}`);
}
fillArrB(arrA);