package OrientacaoObjetos;

public class Jogador {
	// Aqui vai entrar o palpite de cada Jogador
	int numero = 0;

	// Método para os Jogadores adivinharem o nº
	public void adivinhar() {
		numero = (int) (Math.random() * 10);
		System.out.println("Estou pensando em " + numero);

	}
}
