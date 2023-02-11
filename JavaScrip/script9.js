//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
//funcionamiento de la función Substring().

let sentence = prompt("Ingrese una frase");
let newSentence = "";
for (let index = 0; index < sentence.length; index++) {
    let subS = sentence.substring(index, index + 1);
    newSentence += subS + " ";
    /*
    newSentence += sentence[index] + " "; ---tambien se puede hacer así.
    */
}
alert("La nueva frase es: " + newSentence);