import junit.framework.TestCase;

public class CheckMethod extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Setup");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown");
	}
	 public void test() {
		  System.out.println("test");
	  }
	  public void test2() {
		  System.out.println("test2");
	  }
}
