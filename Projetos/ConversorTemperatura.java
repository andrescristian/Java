package cursoJava;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		// Escreva um programa que, com base em uma temperatura em graus celsius, a
		// converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
		// seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C
		// * 1.8 + 32 + 459.67

		Scanner entrada = new Scanner(System.in);

		int denovo;
		double C, K, Re, Ra, F;

		do {
			System.out.println("Qual Tipo de Temperatura quer converter ??");
			System.out.println("1 Kelvin = K");
			System.out.println("2 Réaumur = Re");
			System.out.println("3 Rankine = Ra");
			System.out.println("4 Fahrenheit = F");
			int iniciar = entrada.nextInt();

			if (iniciar == 1) {
				System.out.println("Digite o Valor em Celsius a ser convertido em Kelvin: ");
				C = entrada.nextDouble();
				K = C + 273.15;
				System.out.println("O Valor de " + C + "ºC em Graus Kelvin é " + K);
			} else if (iniciar == 2) {
				System.out.println("Digite o Valor em Celsius a ser convertido em Réaumur: ");
				C = entrada.nextDouble();
				Re = C * 0.8;
				System.out.println("O Valor de " + C + "ºC em Graus Réaumur é " + Re);
			} else if (iniciar == 3) {
				System.out.println("Digite o Valor em Celsius a ser convertido em Rankine: ");
				C = entrada.nextDouble();
				Ra = C * 1.8 + 32 + 459.67;
				System.out.println("O Valor de " + C + "ºC em Graus Rankine é " + Ra);
			} else if (iniciar == 4) {
				System.out.println("Digite o valor a ser convertido de Graus Celsius para Graus Fahrenheit: ");
				C = entrada.nextDouble();
				F = C * 1.8 + 32;
				System.out.println("O valor de " + C + " ºC em Fahrenheit é " + F);
			} else {
				System.out.println("Escolhe um valor entre 1 e 4!!!");
			}
			System.out.println(" ");
			System.out.println(">>> Continuar com os cálculos? 1 = Sim    0 = Não");
			denovo = entrada.nextInt();

		} while (denovo == 1);

		entrada.close();
	}
}
