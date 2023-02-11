//Escribir una función que reciba un frase y devuelva la palabra más larga.
//String Ejemplo: “Guia de JavaScript”
//Resultado esperado : “JavaScript”
let sentence = prompt("Ingrese una frase!!");

function largestWord(sentence) {
    let largest_word = ""
    sentences = sentence.replace(",", " ").split(" "); //replace reemlaza la "," por espacios si hubiere.
    sentences.forEach(function(word){
    if (word.length > largest_word.length){
        largest_word =word;
     };
    });
    return largest_word; 
  };
  
  alert(largestWord(sentence));