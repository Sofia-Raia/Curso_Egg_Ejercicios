/* A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos */
var valores = [true, 5, false, "hola", "adios", 2];
var mayor = "";

for (var i = 0; i < valores.length; i++) {
    if (typeof valores[i] == "string") {
        if (valores[i].length > mayor.length) {
            mayor = valores[i];
        }
    }
}
console.log(mayor);

var resultado = valores[0] && valores[2];
console.log(resultado);

var resultado = valores[0] || valores[2];
console.log(resultado);

var num1 = 0;
var num2 = 0;

for (var i = 0; i < valores.length; i++) {
    if (typeof valores[i] == "number") {
        if (num1 == 0) {
            num1 = valores[i];
        } else {
            num2 = valores[i];
        }
    }
}

var resultado = num1 + num2;
console.log(resultado);

var resultado = num1 - num2;
console.log(resultado);

var resultado = num1 * num2;
console.log(resultado);

var resultado = num1 / num2;
console.log(resultado);