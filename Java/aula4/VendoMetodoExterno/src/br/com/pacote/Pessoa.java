package br.com.pacote;

public class Pessoa {

	//Cria a Atributo nome
		private String name = "Nathan Nariai";
		
		private String pegarNome(String visitanteNome) {
			System.out.println("Quem é??.."+visitanteNome);
			return name;
		}
		
}
