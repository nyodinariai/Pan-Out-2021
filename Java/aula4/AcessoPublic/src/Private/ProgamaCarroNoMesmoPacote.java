package Private;

public class ProgamaCarroNoMesmoPacote {

	public static void main(String[] args) {
		
		//Instancia o objeto Carro
		Carro c = new Carro();
		//Insere os dados no atributo nome
		c.nome = "Ferrari";
		//Chama a função exibeVelocidade() do objeto Carro
		c.exibeVelocidade();
	}
}
