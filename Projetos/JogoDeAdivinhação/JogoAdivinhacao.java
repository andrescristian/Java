package OrientacaoObjetos;
import java.util.Scanner;

public class JogoAdivinhacao {
	Scanner entrada = new Scanner(System.in);
		
	// Criando as 3 Variáveis de Instância (usando a Classe Jogador())
	Jogador j1;
	Jogador j2;
	Jogador j3;

	//Método para iniciar o jogo, que será chamado no arquivo IniciarJogo.java
	public void startGame() {
		// Criando os 3 Objetos Jogador, atribuindo as 3 Variáveis de Instância do começo do código
		j1 = new Jogador();
		j2 = new Jogador();
		j3 = new Jogador();

		// Declarando três Variáveis para guardar os 3 palpites que os jogadores vão fornecer
		int guessj1 = 0;
		int guessj2 = 0;
		int guessj3 = 0;

		// Declarando três Variáveis para guardar um valor Verdadeiro ou Falso baseado na resposta do Jogador
		boolean j1isRight = false;
		boolean j2isRight = false;
		boolean j3isRight = false;

		// Cria um número alvo que os jogadores vão tentar adivinhar
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Estou pensando em um número entre 0 e 9");

		while (true) {
			System.out.println("O número pra adivinhar é " + targetNumber);

			// Chama o método "adivinhar" do arquivo Jogador.java para cada Jogador
			j1.adivinhar();
			j2.adivinhar();
			j3.adivinhar();

			// Vai obter o palpite de cada jogador (o resultado da execução do método
			// adivinhar() acessando a Variável Numérica de cada Jogador)
			guessj1 = j1.numero;
			System.out.println("O Jogador 1 fez o palpite do nº " + guessj1);

			guessj2 = j2.numero;
			System.out.println("O Jogador 2 fez o palpite do nº " + guessj2);

			guessj3 = j3.numero;
			System.out.println("O Jogador 3 fez o palpite do nº " + guessj3);

			// Vai verificar o palpite de cada jogador para ver se é igual ao número alvo
			// Se um jogador acertar, sua Variável será configurada com "true" (Lembrando
			// que configuramos "false" como padrão)
			if (guessj1 == targetNumber) {
				j1isRight = true;
			}
			if (guessj2 == targetNumber) {
				j2isRight = true;
			}
			if (guessj3 == targetNumber) {
				j3isRight = true;
			}

			// Se o jogador 1, 2 ou 3 acertar...
			if (j1isRight || j2isRight || j3isRight) {
				System.out.println("Jogador nº 1 acertou? " + j1isRight);
				System.out.println("Jogador nº 2 acertou? " + j2isRight);
				System.out.println("Jogador nº 3 acertou? " + j3isRight);
				System.out.println("Fim do Jogo !!!");
				break; // Se algum Jogador acertar, é o fim do jogo, e vamos sair do Loop
			} else {
				// Se ninguém acertar, continuar o Loop e o jogo porque ninguém acertou...
				System.out.println("Tentem novamente...");
				entrada.nextLine();
			}
		} //Fim do Loop
	}
}
