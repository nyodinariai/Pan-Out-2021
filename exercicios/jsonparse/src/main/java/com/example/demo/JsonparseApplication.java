package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JsonparseApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		SpringApplication.run(JsonparseApplication.class, args);
		//Construtor
		JsonWriter writer = new JsonWriter("Nathan", "Nariai", 35);
		
		File archiveRoute = new File("./src/main/java/cadastro.json");
		
		if(archiveRoute.exists()) {
			writer.readJson(archiveRoute);
		} else {		
		writer.writeJson();
		
		}
		
		
	}

}
