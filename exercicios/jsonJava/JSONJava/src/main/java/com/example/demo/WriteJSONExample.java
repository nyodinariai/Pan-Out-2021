package com.example.demo;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Cria um JSONObject
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstName", "Lokesh");
		employeeDetails.put("lastName", "Gupta");
		employeeDetails.put("website", "howtodoinjava.com");

		//Coloca os dados do JSONObject anterior dentro da chave "employee"
		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeDetails);

		// Cria um JSONObject
		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstName", "Brian");
		employeeDetails2.put("lastName", "Schultz");
		employeeDetails2.put("website", "example.com");
		
		//Coloca os dados do JSONObject anterior dentro da chave "employee"
		JSONObject employeeObject2 = new JSONObject();
		employeeObject2.put("employee", employeeDetails2);

		// Gera um Array com a lista de employee
		JSONArray employeeList = new JSONArray();
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);

		// Se tudo estiver certo tenta escrever o JSON
		try (FileWriter file = new FileWriter("employees.json")) {
			// Escreve o arquivo JSON.
			file.write(employeeList.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}