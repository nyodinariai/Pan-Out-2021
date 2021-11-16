package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSomar() {
		System.out.println("somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 10.0;
		double result = calculadorinhaTeste.aumentar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	public void testDiminuir() {
		System.out.println("subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 2;
		double result = calculadorinhaTeste.diminuir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	public void testSquare() {
		System.out.println("Quadrado");
		int n1 = 5;
		Calculadora calculadoraTeste = new Calculadora();
		double resultadoEsperado = 25;
		double resultado = calculadoraTeste.square(n1);
		assertEquals(resultadoEsperado, resultado, 0);
	}

}
