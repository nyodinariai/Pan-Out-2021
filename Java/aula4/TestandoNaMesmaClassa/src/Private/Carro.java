package Private;

public class Carro {

	
	//Cria a variavel nome
	
	private String nome;
	
	//Método que imprime a variável
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma "+nome+" é de 380km");
	}
	
	public static void main(String[] args) {
		
		//Instancia o objeto Carro
		Carro c = new Carro();
		//Insere os dados no atributo nome
		c.nome = "Ferrari";
		//Chama a função exibeVelocidade() do objeto Carro
		c.exibeVelocidade();
	}
}
