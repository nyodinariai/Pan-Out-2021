import org.junit.After;
import org.junit.Test;

public class FirstTest {

	//On Junit methods needs to be public and has no return
	
	@Test
	public void validTestMethod() {
		
	}

	//@Test
	public String invalidTestMethod() {
		return "";
	}

	//@Test
	private void  invalidTestMethod1() {
		
	}
	
	//@Test
	protected void invalidTestMethod2() {
		
	}
	
	@Test
	@After
	public void printTest() {
		System.out.println("Test executed!");
	}
	
	@Test
	public void printTest1() {
		System.out.println("Test 1 executed!");
	}
	
	//@Test
	public void nonTestMethod() {
		System.out.println("This message doesn't appear");
	}
	
}
	
