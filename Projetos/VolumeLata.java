package cursoJava;

import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
		// fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam
		// respectivamente o volume, o raio e a altura.
		Scanner entrada = new Scanner(System.in);
		double V, R, A;
		System.out.print("Digite o valor do Raio da lata: ");
		R = entrada.nextDouble();

		System.out.print("Digite o valor da Altura da lata: ");
		A = entrada.nextDouble();

		V = 3.14159 * R * R * A;

		System.out.println("O Volume de uma Lata, em relação aos dados passados, é " + V);

		// Escreva um programa para determinar a quantidade de cavalos necessários para
		// se levantar uma massa de m quilogramas a uma altura de h metros em t
		// segundos. Considere cavalos = (m * h / t) / 745,6999

		double m,h,t,cavalos;
		System.out.print("Digite o valor de Kg: ");
		m = entrada.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		h = entrada.nextDouble();
		
		System.out.print("Digite o valor do tempo em segundos: ");
		t = entrada.nextDouble();
		
		cavalos = (m * h / t) / 745.6999;
		System.out.println("A quantidade de Cavalos com os Atributos passados é "+cavalos);
		entrada.close();
	}

}
