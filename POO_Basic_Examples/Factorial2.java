package udima.u1;

public class Factorial2 {

	/**
	 * Metodo que calcula el factorial del numero que recibe como
	 * argumento de forma recursiva<br>
	 * La recursión es NO FINAL<br>
	 * PRE: n debe ser mayor o igual a 0. Si no se cumple la
	 * precondicion el metodo devolvera el valor -1
	 * 
	 * @param n
	 *            numero del que se quiere calcular su factorial
	 * @return factorial del numero
	 */
	public static int factorialRecursivoPreNoFinal(int n) {
		/* se controla la precondicion */
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			/* recursion no final */
			return n * factorialRecursivoPreNoFinal(n - 1);
		}
	}

	/**
	 * Metodo que calcula el factorial del numero que recibe como
	 * argumento. Para ello delega el calculo en otro metodo.<br>
	 * PRE: n debe ser mayor o igual a 0. Si no se cumple la
	 * precondicion el metodo devolvera el valor -1
	 * 
	 * @param n
	 *            numero del que se quiere calcular su factorial
	 * @return factorial del numero
	 */
	public static int factorialRecursivoPreFinal(int n) {

		/* se controla la precondicion */
		if (n < 0) {
			return -1;
		} else {
			int valorAcumulado = 1;
			/*
			 * recursion final: se llama al metodo privado de calculo
			 * con los parametros adecuados
			 */
			return factorialRecursivoPreFinalAcum(n, valorAcumulado);
		}
	}

	/**
	 * Metodo privado que calcula el factorial del numero que recibe
	 * como argumento de forma recursiva<br>
	 * Al ser privado, este metodo solamente es accesible desde la
	 * propia clase en la que esta definido<br>
	 * La recursión final, para ello utiliza un acumulador<br>
	 * 
	 * @param n
	 *            numero del que se quiere calcular su factorial
	 * @param valorAcumulado
	 *            valor en el que se almacena el acumulado
	 * @return factorial del numero
	 */
	private static int factorialRecursivoPreFinalAcum(int n,
			int valorAcumulado) {

		if (n <= 1) {
			return valorAcumulado;
		} else {
			return factorialRecursivoPreFinalAcum(n - 1, n * valorAcumulado);
		}
	}

}
