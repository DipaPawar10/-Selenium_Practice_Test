package Demo;

import org.testng.annotations.*;

public class AnnotationAttribute {
	
	@Test(description="this is testcse 1",priority=1)
	public void testCase1() {
		System.out.println("Mobile Login Personal Loan");
	}
	@Test(description="this is testcse 2",timeOut=200,priority=2, enabled=false)
	public void testCase2() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Web Login Personal Loan");
		
	}
	@Test(description="this is testcse 3",priority=3,dependsOnMethods= {"testCase1"})
	public void testCase3() {
		System.out.println("API Login Personal Loan");
	}

}
