package Demo;
import org.testng.annotations.*;


public class AutomobileClass {
	@Test
	@Parameters({"AutomonileCompany"})
	public void testCase1(String name) {
		System.out.println(name);
	}

}
