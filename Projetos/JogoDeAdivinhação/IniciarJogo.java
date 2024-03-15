package OrientacaoObjetos;

public class IniciarJogo {

	public static void main(String[] args) {
		//Criando um objeto com a Variável "jogo" através da Classe "JogoAdivinhacao.java"
		JogoAdivinhacao jogo = new JogoAdivinhacao();
		
		//Vai iniciar o Jogo (chamando o Método startGame() da Classe JogoAdivinhacao)
		jogo.startGame();
	}
}
