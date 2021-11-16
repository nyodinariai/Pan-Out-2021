package entradas;

import java.util.Scanner;

public class ScanOutrosTipos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		short num2 = ler.nextShort();
		System.out.println("short: ...");
		System.out.println(num2);
		
		long num3 = ler.nextLong();
		System.out.println("Long: ...");
		System.out.println(num3);
	}
}
