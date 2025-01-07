package ex01;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Libro libro1 = new Libro();
		libro1.setISBN(123456789);
		libro1.setTitulo("Las increibles aventuras de Celta");
		libro1.setAutor("Sara Hevia");
		libro1.setNumPaginas(600);
		
		Libro libro2 = new Libro(); 
		libro2.setISBN(987654321);
		libro2.setTitulo("Las increibles aventuras de Melman");
		libro2.setAutor("Ismael Hernández");
		libro2.setNumPaginas(800);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		Thread.sleep(1000);
		if(libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("el libro 1 tiene mas páginas"); 
		}else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
			System.out.println("el libro 2 tiene mas paginas "); 
		}else {
			System.out.println("los dos tienen el mismo numero de paginas");
		}
	}

}
