package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista2 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Antonio Souza");
		lista.add("Lúcia Ferreira");
		lista.add("Marcelo 1");
		lista.remove("Lúcia Ferreira");
		
		System.out.println(lista.size());
		lista.forEach(System.out::println);
		
		
		System.out.println("-------------");
		
		List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);
		itens.stream().filter(i -> i > 16).forEach(System.out::println);
	}
}
