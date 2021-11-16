package fundamentos;

public class ConversorDeTemperatura {
	public static void main(String[] args) {
		double celcius = 36;
		final double constante = 9/5.0; //para o double funcionar é preciso digitar os numeros com ponto flutuante
		final double constante1 = 32;
		
		double farenheit = celcius*constante + constante1;
		
		System.out.println(farenheit);
		
		celcius = 40;
		farenheit = celcius*constante + constante1;
		
		System.out.println(farenheit);
	}
}
