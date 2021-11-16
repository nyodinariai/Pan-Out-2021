package com.classes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.table.Products;

import com.classes.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
public class Controller {

@Autowired 
private ProductRepository repository; 

@GetMapping("/produtos")
public List<Products> buscarTodos(){
	return repository.findAll();
}

} 