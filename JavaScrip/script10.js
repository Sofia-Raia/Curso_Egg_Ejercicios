//Escribir una función flecha que reciba una palabra y la devuelva al revés.
//let func = (arg1, arg2, ..., argN) => expresion
let funct = (word) => {
    let newWord = "";
    for (let index = word.length; index >= 0; index--) {
        let subS = word.substring(index, index + 1);
        newWord += subS;
    }
    return newWord;
}
/*function funct(word){
  let newWord = "";
    for (let index = word.length; index >= 0; index--) {
        let subS = word.substring(index, index + 1);
        newWord += subS;
    }
    return newWord;                                          Es lo mismo que la funcion flecha...
}*/

let word = prompt("Ingrese una palabra");
alert("la palabra al revez nos queda así: " + funct(word));


