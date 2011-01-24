package parallel;

import junit.framework.TestCase;

public class DelayTest extends TestCase {
	
	public void testWait() throws Exception {
		System.out.println("Waiting 2 seconds");
		Thread.sleep(2000);
	}
}