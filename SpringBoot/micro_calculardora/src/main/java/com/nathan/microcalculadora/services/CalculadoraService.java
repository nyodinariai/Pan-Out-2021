package com.nathan.microcalculadora.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nathan.microcalculadora.model.Calculadora;
import com.nathan.microcalculadora.model.Tabela;

@Service
public class CalculadoraService {

	//@Value("http://localhost:8004")
	@Value("${micro_tabela.host}")
	private String microTabela;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//na calculadora deste projeto, passa duas variaveis
	public Calculadora getCalculo(long tabelaId, int dias) {
		
		//Crio um hash e nele passo um parametro la para o controler como string
		Map<String, String> urlParametros = new HashMap<>();
		
		//a variavel id, vira do parametro
		urlParametros.put("id", ""+tabelaId);
		
		//pegue os dados ralativos a outra aplicação
		Tabela tabela = restTemplate.getForObject(microTabela + "/tabela/{id}", Tabela.class, urlParametros);
		
		return new Calculadora(tabela.getPessoa(), tabela.getPrecoPorDia(), dias);
	}
}
