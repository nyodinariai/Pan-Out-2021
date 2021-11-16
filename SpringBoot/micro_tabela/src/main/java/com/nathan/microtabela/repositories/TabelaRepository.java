package com.nathan.microtabela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.microtabela.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
