DROP DATABASE IF EXISTS superheroe;
CREATE DATABASE superheroe CHARACTER SET utf8mb4;
USE superheroe;

CREATE TABLE creador (
  id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personaje (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
);
/*asi agrego datos a una tabla y los muestro*/

INSERT INTO personaje VALUES(1, 'Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Fisico Nuclear', 1);
INSERT INTO personaje VALUES(2, 'Tony Stark', 'Iron Man', 170, '200 mil', 70, 123, 1963, 'Inventor Industrial', 1);
INSERT INTO personaje VALUES(3, 'Thor Odirson', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey de Asgard', 1);
INSERT INTO personaje VALUES(4, 'Wanda Maximoff', 'Bruja Escarlata', 170, '100 mil', 90, 345, 1964, 'Bruja', 1);
INSERT INTO personaje VALUES(5, 'Carol Danvers', 'Capitana Marvel', 157, '250 mil', 85, 128, 1982, 'Oficial de inteligencia', 1);
INSERT INTO personaje VALUES(6, 'Thanos ', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1);
INSERT INTO personaje VALUES(7, 'Peter Parker', 'Spiderman', 165, '25 mil', 80, 74, 1962, 'Fotografo', 1);
INSERT INTO personaje VALUES(8, 'Steve Roger', 'Capitan America', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
INSERT INTO personaje VALUES(9, 'Bobby Drake', 'Ice Man', 140, '2 mil', 62, 122, 1963, 'Contador', 1);
INSERT INTO personaje VALUES(10, 'Barry Allen', 'Flash', 160, '10 mil', 120, 168, 1956, 'Cientifico Forense', 2);
INSERT INTO personaje VALUES(11, 'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de Negocios', 2);
INSERT INTO personaje VALUES(12, 'Clarck Kent', 'Superman', 165, 'Infinita', 120, 182, 1948, 'Reportero', 2);
INSERT INTO personaje VALUES(13, 'Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa Guerrera', 2);

select * from personaje;

/*asi se cambie un dato por otro en ese caso cambie la fecha de aparicion de superman 1948 a 1938 */
update personaje
set aparicion = 1938
where id_personaje =12;

select *from personaje;

/* asi se elimina una fila*/
delete 
from personaje 
where id_personaje = 10;

select *from personaje;

/*como devolver solo una columna*/
select nombre_real
from personaje ;
/*como devolver de columna  los nombres empiezan con b*/

select nombre_real
from personaje
where nombre_real like 'b%';

/*asi se ordenan las columnas */
select inteligencia
from personaje
order by inteligencia asc;

select *from personaje; /*esto era para ver como estaba la tabla*/




