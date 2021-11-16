package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonWriter {

	public String name;
	
	public String lastName;
	
	public Integer idade;

	
	public JsonWriter(String name, String lastName, Integer idade) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void writeJson() throws FileNotFoundException {
		JSONObject json = new JSONObject();
		
		json.put("Name:", getName());
		json.put("LastName:", getLastName());
		json.put("Idade:", getIdade());
		
		System.out.println(json);
		
		PrintWriter write = new PrintWriter("./src/main/java/cadastro.json");
		write.write(json.toJSONString());
		
		write.flush();
		write.close();
	}
	
	public void readJson(File archiveRoute) throws FileNotFoundException, IOException, ParseException{
		Object json = new JSONParser().parse(new FileReader(archiveRoute));
		
		JSONObject readJson = (JSONObject) json;
		
		Iterator<String> iteratorObject = readJson.keySet().iterator();
		while(iteratorObject.hasNext()) {
			Object key = iteratorObject.next();
			Object value = readJson.get(key);
			
			System.out.println(key+" "+ value);
		}
	}
}
