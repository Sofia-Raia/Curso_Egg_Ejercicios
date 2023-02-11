
/*Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
amarillo, por ejemplo)*/

let colorWords=()=>{
    let newParagraph = "<p>";
    let p = document.getElementById("text");
    let text = p.innerText; //innerText me trae el texto de la etiqueta.
    let arrOfWords= text.split(" ");
    for (const word of arrOfWords) {
        if(word.length > 8){
            newParagraph+=`<span style='background-color: pink;'>${word}</span>`;
        } else {
            newParagraph+=word;
        }
        newParagraph+=" ";
    } 
    newParagraph+="</p>";
    p.innerHTML = newParagraph;
}  
colorWords();