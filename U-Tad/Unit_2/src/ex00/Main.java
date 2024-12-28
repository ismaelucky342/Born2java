package ex00;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Cuenta cuenta = new Cuenta(); 
		cuenta.setTitular("Sariwis");
		cuenta.setCantidad(8000.0);
		Thread.sleep(500);
		System.out.println("datos de la cuenta generales: " + cuenta);
		Thread.sleep(500);
		cuenta.ingresar(42.0);
		System.out.println("Después de ingresar 42e: " + cuenta);
		Thread.sleep(500);
		cuenta.retirar(9.0);
		System.out.println("Despues de retirar 9e" + cuenta);
		Thread.sleep(500);
		cuenta.ingresar(150.0);
		System.out.println("Después de ingresar 150e: " + cuenta);
		Thread.sleep(500);
		cuenta.retirar(300.0);
		System.out.println("estado de la cuenta: " + cuenta);
		Thread.sleep(500);
	}
}
