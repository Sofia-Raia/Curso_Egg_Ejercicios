/*Escribir un programa para obtener un array de las propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.*/
let person={
    name: "Sofia",
    age: 25,
    genre:"M",
    weight: 85,
    height: 1.71
}
let arr=(person) => Object.values(person);
alert(`Arreglo de person: ${arr(person)}`);