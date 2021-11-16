import java.util.LinkedList;

public class LinkedContain {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		// Use add()
		list.add("Geeks");
		list.add("Geeks");
		list.add("Geeks");
		list.add("Geeks");
		list.add("Geeks");
		
		System.out.println("Does the list contains 'Geeks' : "+ list.contains("Geeks"));
	}
}
