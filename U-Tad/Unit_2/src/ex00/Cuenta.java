/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos:
titular
cantidad (puede tener decimales).
Crea sus métodos get, set y toString.
Tendrá dos métodos especiales:
ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
*/

package ex00;

public class Cuenta {
	
	private String titular; 
	private double cantidad;
	
	public String getTitular() {
		return titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	} 
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad; 
		}
	}
	
	public void retirar(double cantidad) {
		double nuevacant = this.cantidad - cantidad;
		if(nuevacant < 0) {
			System.out.println("No se puede retirar una cantidad negativa");
			return; 
		}
		this.cantidad = nuevacant; 
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
}
