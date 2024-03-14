package udima.u1;

public class Prueba3 {

	public static void main(String[] args) {

		int n = -3;

		// se llama a los metodos con el mismo valor de n
		int resultadoRecursivo = Factorial.factorialRecursivo(n);

		// se muestra por pantalla el resultado
		System.out.println(
				"El factorial recursivo de " + n + " es " + resultadoRecursivo);

	}

}
