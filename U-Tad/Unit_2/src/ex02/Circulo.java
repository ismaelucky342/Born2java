package ex02;

public class Circulo {
	private Punto centro; 
	private double radio;
	
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	} 
	
	public void setearCentro(int x, int y)
	{
		this.centro.setX(x);
		this.centro.setY(y);
	}
}
