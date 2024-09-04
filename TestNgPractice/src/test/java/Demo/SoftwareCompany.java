package Demo;
import org.testng.annotations.*;


public class SoftwareCompany {
	@Test()
	@Parameters({"SoftwareCompany"})
	public void TestCase1(String name) {
		System.out.println(name);
	}

}
