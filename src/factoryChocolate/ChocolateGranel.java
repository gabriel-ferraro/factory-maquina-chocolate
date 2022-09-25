package factoryChocolate;

public class ChocolateGranel extends AbsChocolate {
	
	public double peso;
	
	ChocolateGranel(String nome, double preco, double peso) {
		super(nome, preco);
		this.peso = peso;
	}
	
	@Override
	public void mostrarChocolate() {
		System.out.printf("chocolate a granel %s \t peso: %.2f g \t total: %.2f %n", this.nome, this.peso, this.valorChocolate());
	}

	@Override
	public double valorChocolate() {
		return this.preco * (this.peso / 1000);
	}

}
