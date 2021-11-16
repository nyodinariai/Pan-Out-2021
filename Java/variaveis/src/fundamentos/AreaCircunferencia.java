package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//variavel é um espaço de mémoria reservado para inserção de dados
		double raio = 3.4;
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.println("Área = " + area + "m².");
		
		raio = 25;
		area = pi * raio * raio;
		System.out.println("Área = " + area + "m².");
	}
}
