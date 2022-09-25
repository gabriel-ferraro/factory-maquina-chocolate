package factoryChocolate;

public class ChocolateFactory {

	public static IChocolate criarChocolate(String tipo, String nome, double valor, int qtde) {
		if(tipo == "barra") {
			return new ChocolateBarra(nome, valor, qtde);
		}
		
		return null;
	}

	public static IChocolate criarChocolate(String tipo, String nome, double valor, double peso) {
		if(tipo == "granel") {
			return new ChocolateGranel(nome, valor, peso);
		}
		
		return null;
	}
}
