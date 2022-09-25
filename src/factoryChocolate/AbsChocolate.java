package factoryChocolate;

public abstract class AbsChocolate implements IChocolate {
	
	public String nome;
	public double preco;
	
	AbsChocolate(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
}
