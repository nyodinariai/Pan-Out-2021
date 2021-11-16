package com.nathan.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.app.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{

}
