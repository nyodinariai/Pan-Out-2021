package staticMethods;

public class Program {
	public static void main(String[] args) {
		System.out.println(Product.resultado(10,50));
		
		Product produtinho = new Product();
		System.out.println(produtinho.mudeNomeProduto("João"));
		
		System.out.println(Product.pegarCpf("     999-222-222-22"));
	}
}
