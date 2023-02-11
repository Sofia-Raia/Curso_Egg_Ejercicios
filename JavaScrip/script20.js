/*Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
muestre el siguiente array [6, 9, 12, 15, 18].*/
let matriz= [[3], [6], [9], [12], [15]] ;
let arr=[];
let arr1=[];
let num1=3;
let funct=(matriz)=>{
    arr=matriz.flatMap( elementMatrixFlattened => elementMatrixFlattened); 

    for (let index = 0; index < 5; index++) {
        let nume= arr[index];
        let n= num1+ nume;
        arr1.push(n); 
    }
    alert(`Matriz :${matriz}`);
    alert(`Matriz convertida a Array :${arr1}`);
}
funct(matriz);
/* console.log(matriz);
console.log(arr1); */
