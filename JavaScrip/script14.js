/*Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
var book = {
    isbn: "",
    title: "",
    author: "",
    numberOfPages: ""
}


let askData = (book)=>{
    alert("Ingrese los datos del libro:");
    book.isbn=prompt("ISBN:");
    book.title= prompt("Título:");
    book.author= prompt("Autor:");
    book.numberOfPages= prompt("N° de pág:");
}
let showData = (book)=>{
    alert(`El ISBN del libro es: ${book.isbn}
    El Título es: ${book.title}
    El Autor es: ${book.author}
    El N° de pág es: ${book.numberOfPages}`);
}
let bookAsk= askData(book);
let bookShow =showData(book);