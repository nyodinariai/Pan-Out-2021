package Program;

import java.util.Stack;

public class Program extends PilhaRepo{

	public static void main(String[] args) {
		Stack<String> pilhinha = new Stack<>();
		System.out.println("stack: " + pilhinha);
		
		insertingPush(pilhinha, "Caixa acústica 110");
		insertingPush(pilhinha, "Caixa acústica 110");
		insertingPush(pilhinha, "Caixa acústica 110");
		deletingPop(pilhinha);
		deletingPop(pilhinha);
	}

}
