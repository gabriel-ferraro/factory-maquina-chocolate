package factoryChocolate;

public class Consumidor {

	public static void main(String[] args) {
		System.out.println("Maquina de chocolate\n");
		
		IChocolate chocolateBarra = ChocolateFactory.criarChocolate("barra", "Hershey's", 7.99, 2); //tipo,nome,valor,qtde
		IChocolate chocolateGranel = ChocolateFactory.criarChocolate("granel", "Bibs", 18, 500f); //tipo,nome,valor,peso(em gramas)
		
		System.out.println("Chocolates comprados:\n");
		cupomFiscal(chocolateBarra, chocolateGranel);
	}
	
	public static void cupomFiscal(IChocolate... chocolates) {
		double total = 0;
		for(IChocolate chocolate: chocolates) {
			chocolate.mostrarChocolate();
			total += chocolate.valorChocolate();
		}
		System.out.println("Total da compra " + total);
	}
}
