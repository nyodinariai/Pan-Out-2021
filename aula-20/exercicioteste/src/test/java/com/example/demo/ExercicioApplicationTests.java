package com.example.demo;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.ContatoModel;
import com.example.demo.repository.ContatoRepository;

@SpringBootTest
public class ExercicioApplicationTests {

	@Autowired
	private ContatoRepository contatoRepository;
	
	private ContatoModel contatoModel;
	
	@Rule 
	public ExpectedException expectedException = ExpectedException.none(); 
	
	@Before
	public void start() {
		contatoModel = new ContatoModel("027", "333333", "Pedro");
	}

	@Test
	public void seContatoEstaNulo() {
		assertNotNull(contatoModel);
	}
	
	@Test
	public void seDDDEstaNulo() {
		assertNotNull(contatoModel.getDdd());
	}
	
	@Test
	public void seTelefoneEstaNulo() {
		assertNotNull(contatoModel.getTelefone());
	}
	
	@Test
	public void seNomeEstaNulo() {
		assertNotNull(contatoModel.getNome());
	}
}
