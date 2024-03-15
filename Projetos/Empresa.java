package cursoJava;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Criar um programa que calcule a média de salários de uma empresa, pedindo ao
		// usuário a grade de funcionários e os salários, e devolvendo a média salarial.
		double salario1, salario2, salario3, salario4, media;
		int denovo;

		do {
			System.out.print("Digite o Valor do 1º Salario: ");
			salario1 = entrada.nextDouble();

			System.out.print("Digite o Valor do 2º Salario: ");
			salario2 = entrada.nextDouble();

			System.out.print("Digite o Valor do 3º Salario: ");
			salario3 = entrada.nextDouble();

			System.out.print("Digite o Valor do 4º Salario: ");
			salario4 = entrada.nextDouble();

			media = (salario1 + salario2 + salario3 + salario4) / 4;
			System.out.println("A média Salarial é: " + media);

			System.out.println("Refazer Cálculo? 1=Sim 2=Não");
			denovo = entrada.nextInt();
		} while (denovo == 1);
		entrada.close();
	}

}
