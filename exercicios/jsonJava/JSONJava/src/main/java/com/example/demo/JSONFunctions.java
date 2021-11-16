package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.CDL;
import org.json.Cookie;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONWriter;
import org.json.Property;
import org.json.XML;

public class JSONFunctions {
	public static void JSONExampleArray1() {
		// Criação de um Objeto JSON (JSONObject) a partir de uma String contendo um
		// objeto JSONArray
		// Primeiro declarar um Array dentro de uma String
		String arrayStr = "[" + "true," + "false," + "\"true\"," + "\"false\"," + "\"hello\"," + "23.45e-4,"
				+ "\"23.45\"," + "42," + "\"43\"," + "[" + "\"world\"" + "]," + "{" + "\"key1\":\"value1\","
				+ "\"key2\":\"value2\"," + "\"key3\":\"value3\"," + "\"key4\":\"value4\"" + "}," + "0," + "\"-1\""
				+ "]";

		// Então inicializamos o JSONArray através do seu construtor
		JSONArray array = new JSONArray(arrayStr);
		System.out.println("Values array: " + array);

		// We convert that array into a JSONObject, but first, we need the labels, so we
		// need another JSONArray with the labels.
		// Here we will use an auxiliary function to get one for the example.

		// Antes converter a array em um JSONObject é preciso listar as as chaves.

		// Criação da variavel list do tipo JSONArray para listar as chaves.
		// a função "listNumberArray()" conta a quantidade de itens no array até um
		// limite determinado,
		// no caso abaixo o limite foi o tamanho do array.
		JSONArray list = listNumberArray(array.length());
		System.out.println("Label Array: " + list.toString());

		// Depois de identificado o valor das chaves, cria-se o objeto JSON atráves da
		// função toJSONObject.
		JSONObject object = array.toJSONObject(list);
		System.out.println("Final JSONOBject: " + object);
	}

	// Essa função cria a lista de chaves da Array.
	private static JSONArray listNumberArray(int max) {
		JSONArray res = new JSONArray();
		for (int i = 0; i < max; i++) {
			// Para funcionar o valor precisa ser do tipo String
			res.put(String.valueOf(i));
		}
		return res;
	}

	// Essa função cria um array sem a criação de uma String com o conteudo.
	public static void JSONExampleArray2() {

		//Primeiro cria-se uma array vazia
		JSONArray array = new JSONArray();

		
		//Inclui os elementos com o .put()
		array.put("value");
		array.put(5);
		array.put(-23.45e67);
		array.put(true);

		//Cria a lista de chaves do array
		JSONArray list = listNumberArray(array.length());
		
		//Cria o JSON Object
		JSONObject object = array.toJSONObject(list);
		System.out.println("Final JSONOBject: " + object);
	}
	
	//Esse metodos cria um JSON a partir de Strings
	public static void JSONExampleStringer() {

		// Inicia o JSONStringer
		JSONStringer jsonStringer = new JSONStringer();

		// Para adicionar os elementos primeiro é preciso utilizar o método .object()
		
        jsonStringer.object();

        //Depois disso é possível incluir a as chaves e os valores atráves das funções .values() e .key()
        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        //Para finalizar o processo utilize a função .endObject()

        jsonStringer.endObject();

       
        //Despois de criar o JSONStringer, é preciso converte-lo numa String para ser utilizada pelo construtor do JSONObjects
        
        //Converte o JSONStringer numa String
        String str = jsonStringer.toString();
        
        //Transforma o a String num JSONObject
        JSONObject jsonObject = new JSONObject(str);
        
       System.out.println("Final JSONOBject: " + jsonObject);
	}
	
	public static void JSONExampleObject1() {

		//É possível criar um JSONObject a partir de uma String através do seu construtor de classe

		//String
		//A String precisa ser formatada como um JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		
		//Construtor de classe
		JSONObject example = new JSONObject(string);
		System.out.println("Final JSONObject: " + example);
		
	}
	
	public static void JSONExampleObject2() {

		// Também é possível criar um JSONObject sem utilizar outras funções

		//Cria o JSONObject
		JSONObject example = new JSONObject();


		// Primeiro adicionam-se o formato chave e valor
		example.put("key", "value");

		//Essa forma de criar JSONObjects precisa seguir a seguinte sequencia, primeiro a chave depois o valor

		example.put("key2", 5);
		example.put("key3", -23.45e67);
		example.put("trueValue", true);

		//Valores nulos não podem ser utilizados

		//example.put("nullValue", null); Isso não é possível
		
		 System.out.println("Final JSONOBject: " + example);
	}
	
	public static void JSONExampleObject3() {

		//Também é possível criar JSONObjects a partir do Java Map
		//Para isso é preciso que as keys sejam stringas e os values podem ser de quaisquer valores

		//Criando a variável
		Map<String,Double> map = new HashMap<String, Double>();
		
		//Inclusão dos dados
		map.put("key1", 1.0);
		map.put("key2", -23.45e67);

		//Criando o JSONObject com o Java Map com a construtor de classe
		JSONObject example = new JSONObject(map);
		 System.out.println("Final JSONOBject: " + example);
	}
	
	public static void JSONExamplWriter() {

		//Para utilizar esse método é necessario utilizar um classe auxiliar como o StringBuilder para ser manipulado

		//Cria a variável do tipo StringBuilder
		StringBuilder write = new StringBuilder();
		
		//Inicia o processo de escrita do JSONWriter
		JSONWriter jsonWriter = new JSONWriter(write);

		//Para marcar o inicio do processo é preciso chamar a função .object()
		jsonWriter.object();
		
		//Para escrever incluir as informações é necessário utilizar as funções:
		// .key() para definir as chaves e .value() para definir os valores.
		
		jsonWriter.key("trueValue").value(true);
		jsonWriter.key("falseValue").value(false);
		jsonWriter.key("nullValue").value(null);
		jsonWriter.key("stringValue").value("hello world!");
		jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		jsonWriter.key("intValue").value(42);
		jsonWriter.key("doubleValue").value(-23.45e67);
		
		//Para finalizar a operação é necessário utilizar a função .enfObject()
		jsonWriter.endObject();
		
		//Escreve o resultado como String
		
		System.out.println("JSON: " + write.toString());
		
		//Essa função não retorna um JSONObject
		
	}
	
	public static void JSONExampleTokener() {

		//JSONTokener para identrificar um token que pode ser utilizado no JSONArray,JSONObject

		String string = "this is not a valid JSON string";
		JSONTokener token = new JSONTokener(string);
		
		//Utilizando o JSONtokener como String no JSONObject e no JSONArray

		JSONObject object = new JSONObject(token);
		JSONArray array = new JSONArray(token);
		
	}
	
	//Conversores de JSON
	
	public static void JSONObjectToArray() {
		//Cria o JSONObject
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

		JSONObject example = new JSONObject(string);
		
		//Cria uma array com as chaves
		
		JSONArray keyStrings = listNumberArray(example.length());
		
		//Converte o array com usando o JSONObject e o Array que lista as chaves
		
		JSONArray array = example.toJSONArray(keyStrings);
		
		System.out.println("Final JSONArray: " + array);
	}

	//Converte um JSON em um XML
	public static void XMLToExampleConversion() {

		//Cria o JSONObject
		
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		JSONObject example = new JSONObject(string);

		//Para obter o XML é precito convertelo em String através da função toString()

		String output = XML.toString(example);
		System.out.println("Final XML: " + output);
	}
	
	// Converte um XML para um JSON
	public static void XMLFromExampleConversion() {

		//Cria uma string no formato XML

		String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

		//Converte a string em um JSONObject() através da função toJSONObject()

		JSONObject output = XML.toJSONObject(string);
		
		System.out.println("Final JSONObject: " + output);
	}

	//Converte JSON para um Cookie
	public static void CookieToExampleConversion() {

		//Cria um objeto JSONObject que precisa iniciar com uma entrada para o nome do Cookie e um campo name e seu name
		//Cookie não suporta booleanos
		
		String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
		JSONObject example = new JSONObject(string);
		
		//Recebe uma String com o formato do cookie 
		String output = Cookie.toString(example);
		System.out.println("Final Cookie: " + output);
	}
	
	//Converte um Cookie em JSON
	public static void CookieFromExampleConversion() {

		//Cria uma String no formato de um cookie

		String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

		//Transforma a String do Cookie em um JSONObject através do metódo toJSONOBject()

		JSONObject output = Cookie.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}
	
	//Converte o JSON em uma requisição HTTP
	public static void HTTPToExampleConversion() {

		//Recebe um string formata como JSON com os recursos minimos de um header de uma requisição HTTP
		String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

		//Transforma a string em um JSONObject
		JSONObject example = new JSONObject(string);

		//Cria uma string JSON com o formato HTTP através do método toString()
		String output = HTTP.toString(example);
		System.out.println("Final HTTP: " + output);
	}
	
	//Converte uma requisição HTTP em JSON
	public static void HTTPFromExampleConversion() {

		//String com as informações de uma requisição HTTP
		String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

		//Converte a string com o HTTP em um JSONObject com o método toJSONObject
		JSONObject output = HTTP.toJSONObject(string);
		System.out.println("Final JSONObject: " + output);
	}

	//Converte JSON para o formato CDL (Comma Delimited List)
	public static void CDLToExampleConversion() {

		//We start with some JSONObjects with the same values in the keys but different values in the "values"

		// Cria a String com os valores formatados como JSON
		String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
		//Converte a String formatada como JSON em um JSONObject
		JSONObject example = new JSONObject(string);

		// Cria a String com os valores formatados como JSON
		String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
		//Converte a String formatada como JSON em um JSONObject
		JSONObject example2 = new JSONObject(string2);
		
		//Converte o JSONObject em JSONArray
		JSONArray array = new JSONArray();
		array.put(example);
		array.put(example2);

		//Transforma em uma String no formato CDL
		String output = CDL.toString(array);
		System.out.println("Final CDL: \r\n" + output);
	}
	
	//Converte um CDL em JSON
	public static void CDLFromExampleConversion() {

		//Cria uma String formatada em CDL
		String string = "0,1,2,3\n"
				+ "value,5,-2.345E+68,true\n"
				+ "value2,6,-8.345E+68,false";
		
		//Cria um JSONArray a partir da String CDL e converte através do método toJSONArray()
		JSONArray output = CDL.toJSONArray(string);
		System.out.println("Final JSONArray: " + output);
	}

	//Converte JSON em Properties
	public static Properties PropertyToExampleConversion() {

	//Cria a String formatada como JSON
	String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
	
	//Cria o JSONObject a partir da String
	JSONObject example = new JSONObject(string);

	//Converte o JSONObject em uma String com as Properties através do método toProperties()
	Properties output = Property.toProperties(example);
	System.out.println("Final Properties: " + output);

	return output;
	}

	//Converte Properties em JSON
	public static void PropertyFromExampleConversion() {

		//Cria o objeto Properties
		Properties input = PropertyToExampleConversion();

		//Coonverte o objeto Properties em JSONObject através do método toJSONObject().
		JSONObject output = Property.toJSONObject(input);
		System.out.println("Final JSONObject: " + output);
	}

}
