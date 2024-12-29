package ex03;

public class Miclase {
	private int entero;

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	} 
	
	public Miclase() {
		entero = 0; 
	}
	public Miclase(int entero) {
		this.entero = entero; 
	}
	public Miclase(double decimal) {
		entero = (int) decimal; 
	}
	public Miclase(int num1, int num2) {
		entero = num1 * num2; 
	}
	
}
