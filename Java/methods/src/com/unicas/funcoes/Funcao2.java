package com.unicas.funcoes;

public class Funcao2 {

	//static desobriga a função
	static int myMethod(int x) {
		return 5 + x;
	}
	
	public static void main(String[] args) {
		System.out.println(myMethod(3));
	}
}