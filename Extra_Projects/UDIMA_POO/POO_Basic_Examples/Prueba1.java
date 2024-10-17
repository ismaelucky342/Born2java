package udima.u1;

public class Prueba1 {

	public static void main(String[] args) {

		int n = 5;

		// se llama a los metodos con el mismo valor de n
		int resultadoIterativo = Factorial.factorialIterativo(n);
		int resultadoRecursivo = Factorial.factorialRecursivo(n);

		// se muestra por pantalla el resultado
		System.out.println(
				"El factorial iterativo de " + n + " es " + resultadoIterativo);
		System.out.println(
				"El factorial recursivo de " + n + " es " + resultadoRecursivo);

	}

}
