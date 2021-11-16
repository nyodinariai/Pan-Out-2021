package Program;

import java.util.Stack;

public class PilhaRepo {

	public static void insertingPush(Stack pilhinha, String x) {
		pilhinha.push(new String(x));
		
		System.out.println("push -> " + x);
		System.out.println("stack -> " + pilhinha);
	}
	
	public static void deletingPop(Stack pilhinha) {
		System.out.println("pop -> ");
		
		String x = (String) pilhinha.pop();
		System.out.println(x);
		
		System.out.println("stack: " + pilhinha);
		
	}
}
