package BatchTesting;
import org.testng.annotations.*;
public class HomeScreenTest {
	
	//LaunchApplication
	//VerifyTitle
	//VerifyLogo

	@Test
	public void LaunchApplication() {
		System.out.println("Application launch passes");
	}
	
	@Test
	public void Verifytitle() {
		System.out.println("Verify title pass");
    }
	
	@Test
	public void VerifyLogo() {
		System.out.println("verify logo pass");

	}
}
