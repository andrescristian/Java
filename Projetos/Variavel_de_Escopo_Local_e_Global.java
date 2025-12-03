public class ContadorLocaleGlobal {
	public static void main(String[] args) {
		/*
		 * Crie um programa que:
		 * Tenha uma variável de classe chamada contadorGlobal que começa em 0. Dentro
		 * do método main, crie um loop for que execute 3 vezes.
		 * 
		 * Em cada iteração: Declare uma variável local chamada contadorLocal, iniciando
		 * em 0. Some 1 à variável contadorGlobal. Some 1 à variável contadorLocal.
		 * Imprima os valores de contadorGlobal e contadorLocal.
		 */

		// Variável Global
		int contadorGlobal = 0;

		for (int i = 0; i < 3; i++) {

			//Variável Local
			int contadorLocal = 0;

			contadorLocal++;
			contadorGlobal++;

			System.out.println("Valor do Contador Local " + contadorLocal);
			System.out.println("Valor do Contador Global: " + contadorGlobal);

			System.out.println("-------------");

		}

		System.out.println("Valor somado do Contador Global");
		System.out.println(contadorGlobal);
	}
}
