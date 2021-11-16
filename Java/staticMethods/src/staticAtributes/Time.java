package staticAtributes;

public class Time {

	//muitos atletas
	//pertence ao objeto
	
	String atleta;
	
	//um professor
	//pertence a classe
	static String professor;
	
	// Metodos estaticos não precisam ser instanciados, atributos comuns precisam ser instanciados
	static void treinar() {
		System.out.println(professor);
		
		Time atleta1 = new Time();
		System.out.println(atleta1);
	}
}
