package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSONExample 
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
    	//Cria o JSONParser para ler o arquivo
        JSONParser jsonParser = new JSONParser();
         
        //Procura pelo arquivo e tenta lê-lo se encontra-lo
        try (FileReader reader = new FileReader("employees.json"))
        {
            //Lê o arquivo JSON
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            
            //Imprime os dados Lidos
            System.out.println(employeeList);
             
            //Faz a iteração com a employeeList
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
            //Exceção se o arquivo não for encontrado
        } catch (FileNotFoundException e) {
            e.printStackTrace();
          //Exceção por problemas de IO
        } catch (IOException e) {
            e.printStackTrace();
          //Exceção por problemas de Parse
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
        //Retorna uma lista de "employee
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Retorna o employee pelo firstName
        String firstName = (String) employeeObject.get("firstName");    
        System.out.println(firstName);
         
        //Retorna o employee pelo lastName
        String lastName = (String) employeeObject.get("lastName");  
        System.out.println(lastName);
         
        //Retorna o employee pelo websit
        String website = (String) employeeObject.get("website");    
        System.out.println(website);
    }
}