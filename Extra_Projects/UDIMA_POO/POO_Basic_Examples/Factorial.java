package udima.u1;

public class Factorial {

	/**
	 * Dentro de la clase se implementaran las diferentes variantes
	 * del calculo del factorial de un numero. Los metodos se
	 * definiran como estaticos.
	 */

	/**
	 * Metodo que calcula el factorial del numero que recibe como
	 * argumento de forma iterativa
	 * 
	 * @param n
	 *            numero del que se quiere calcular su factorial
	 * @return factorial del numero
	 */
	public static int factorialIterativo(int n) {
		int res = 1;
		while (n > 0) {
			res *= n;
			n--;
		}
		return res;
	}

	/**
	 * Metodo que calcula el factorial del numero que recibe como
	 * argumento de forma recursiva<br>
	 * PRE: n debe ser mayor o igual a 0
	 * 
	 * @param n
	 *            numero del que se quiere calcular su factorial
	 * @return factorial del numero
	 */
	public static int factorialRecursivo(int n) {
		if (n == 0) {
			return 1; /* caso basico */
		} else {
			// caso recursivo
			return n * factorialRecursivo(n - 1);
		}
	}

	/**
	 * Metodo que calcula el factorial del numero que recibe como
	 * argumento de forma recursiva<br>
	 * PRE: n debe ser mayor o igual a 0. Si no se cumple la
	 * precondicion el metodo devolvera el valor -1
	 * 
	 * @param n
	 *            numero del que se quiere calcular su factorial
	 * @return factorial del numero
	 */
	public static int factorialRecursivoPre(int n) {
		/* se controla la precondicion */
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * factorialRecursivoPre(n - 1);
		}
	}

	public static void main(String[] args) {

		int n = -3;

		// se llama a los metodos con el mismo valor de n
		int resultadoIterativo = factorialIterativo(n);
		int resultadoRecursivo = factorialRecursivo(n);
		int resultadoRecursivo2 = factorialRecursivoPre(n);

		// se muestra por pantalla el resultado
		System.out.println(
				"El factorial iterativo de " + n + " es " + resultadoIterativo);
		System.out.println(
				"El factorial recursivo de " + n + " es " + resultadoRecursivo);
		System.out.println(
				"El factorial recursivo con control de la precondicion de " + n
						+ " es " + resultadoRecursivo2);
	}

}
