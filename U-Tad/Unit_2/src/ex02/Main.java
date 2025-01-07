package ex02;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Punto point = new Punto(); 
		
		point.setX(20);
		point.setY(23);
		System.out.println("coordenadas del punto: (" + point.getX() + ", " + point.getY() +")");
        
		Thread.sleep(500);
		// Crear un objeto Circulo
        Circulo circulo = new Circulo();
        circulo.setCentro(point); // Usar el punto como centro
        circulo.setRadio(7.5);

        Thread.sleep(500);
        // Mostrar información del círculo
        System.out.println("Centro del círculo: (" + circulo.getCentro().getX() + ", " + circulo.getCentro().getY() + ")");
        System.out.println("Radio del círculo: " + circulo.getRadio());
        
        Thread.sleep(500);
        // Cambiar el centro del círculo usando coordenadas
        circulo.setearCentro(20, 30);
        System.out.println("Nuevo centro del círculo: (" + circulo.getCentro().getX() + ", " + circulo.getCentro().getY() + ")");
    
	
	
	}
}
