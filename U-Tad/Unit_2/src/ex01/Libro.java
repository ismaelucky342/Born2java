/*Crear una clase Libro que contenga los siguientes atributos:
ISBN
Título
Autor
Número de páginas
Crear los respectivos métodos get y set correspondientes para cada atributo.
Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN … creado por el autor … tiene … páginas”
En el método main:
crear 2 objetos Libro (con los valores que se quieran) y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.*/

package ex01;

public class Libro {
	private int ISBN; 
	private String autor; 
	private String titulo; 
	private int numPaginas;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	} 
	
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", autor=" + autor + ", titulo=" + titulo + ", numPaginas=" + numPaginas + "]";
	}
	
}
