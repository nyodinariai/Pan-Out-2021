package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonJavaApplication {

	public static void main(String[] args) {
		JSONFunctions jsonFunctions = new JSONFunctions();
		
		// jsonFunctions.JSONObjectToArray();
		// jsonFunctions.JSONExampleArray1();
		// jsonFunctions.JSONExampleArray2();
		// jsonFunctions.JSONExampleStringer();
		// jsonFunctions.JSONExampleObject1();
		// jsonFunctions.JSONExampleObject2();
		// jsonFunctions.JSONExampleObject3();
		// jsonFunctions.JSONExamplWriter();
		// jsonFunctions.XMLToExampleConversion();
		// jsonFunctions.XMLFromExampleConversion();
		// jsonFunctions.CookieToExampleConversion();
		// jsonFunctions.CookieFromExampleConversion();
		// jsonFunctions.HTTPToExampleConversion();
		// jsonFunctions.HTTPFromExampleConversion();
		 jsonFunctions.CDLToExampleConversion();
		// jsonFunctions.CDLFromExampleConversion();
		// jsonFunctions.PropertyToExampleConversion();
		// jsonFunctions.PropertyFromExampleConversion();
	}

	
}
