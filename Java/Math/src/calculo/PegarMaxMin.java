package calculo;

public class PegarMaxMin {

	public static void main(String[] args) {
		
		//aquecimento 1
		System.out.println("Maximo: "+ Math.max(5, 10));
		System.out.println("Mínimo: "+ Math.min(5, 10));
		
		//ceil arredonda para cima
		//florr arredonda para baixo
		double a = 3.5;
		System.out.println("ceil arr. para cima "+ Math.ceil(a));
		System.out.println("floor arr para baixo "+ Math.floor(a));
		
		//inicia com array
		int[] arr = {4, 2, 5, 3, 6};
		
		//inicial com zero
		int max = arr[0];
		
		
		//for
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println("Maximo: " + max);
	}
}
