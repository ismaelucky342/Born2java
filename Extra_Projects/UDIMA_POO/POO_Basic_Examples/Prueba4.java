package udima.u1;

public class Prueba4 {

public static void main(String[] args) {

	int n = 5;
	int resultadoRecursionNoFinal = Factorial2
			.factorialRecursivoPreNoFinal(n);
	int resultadoRecursionFinal = Factorial2.factorialRecursivoPreFinal(n);

	System.out.println(
			"El factorial recursivo con control de la precondicion versión no final de "
					+ n + " es " + resultadoRecursionNoFinal);
	System.out.println(
			"El factorial recursivo con control de la precondicion versión final de "
					+ n + " es " + resultadoRecursionFinal);
}

}
