package udima.u1;

public class Prueba2 {

public static void main(String[] args) {

	int n = -3;

	// se llama a los metodos con el mismo valor de n
	int resultadoIterativo = Factorial.factorialIterativo(n);
	int resultadoRecursivoPre = Factorial.factorialRecursivoPre(n);

	// se muestra por pantalla el resultado
	System.out.println(
			"El factorial iterativo de " + n + " es " + resultadoIterativo);
	System.out.println(
			"El factorial recursivo (con control de precondicion) de " + n
					+ " es " + resultadoRecursivoPre);

}

}
