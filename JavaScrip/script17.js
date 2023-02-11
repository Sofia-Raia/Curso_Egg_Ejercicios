//Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el resultado.
let arr =[1,2,3,4,5,6];
let functArray=(arr)=>{
    arr.splice(4,5);
    arr.splice(5,6);
    return arr;

}
alert(`Arreglo inicial ${arr}`);
alert(`El arreglo nos quedo asi ${functArray(arr)}`);

