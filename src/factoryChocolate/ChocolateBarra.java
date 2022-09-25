package factoryChocolate;

public class ChocolateBarra extends AbsChocolate {

	public int qtde;
	
	ChocolateBarra(String nome, double preco, int qtde) {
		super(nome, preco);
		this.qtde = qtde;
	}
	
	@Override
	public void mostrarChocolate() {
		System.out.printf("chocolate de barra %s \t qtde: %d \t total: %.2f %n", this.nome, this.qtde, this.valorChocolate());
	}

	@Override
	public double valorChocolate() {
		return this.preco * this.qtde;
	}

}
