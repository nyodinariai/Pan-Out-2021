package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer>{

	@Query(value = "SELECT * FROM cliente_model u WHERE u.tipo = :tipo ", nativeQuery = true)
	List<ClienteModel> procuraTipoPessoas(Integer tipo);
	
	@Query(value = "SELECT * FROM cliente_model u WHERE u.tipo = :tipo ", nativeQuery = true)
	List<ClienteModel> procuraPessoasFísicas(Integer tipo);
	//todos
	@Query(value = "SELECT * FROM cliente_model c  ", nativeQuery = true)
	List<ClienteModel> procuraTodos();
	//por ordem alfabetica
	@Query(value = "SELECT * FROM cliente_model c ORDER BY c.nome ", nativeQuery = true)
	List<ClienteModel> procuraTodosAlfabetico();
}
