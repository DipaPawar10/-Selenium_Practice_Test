package Demo;
import org.testng.annotations.*;


public class GroupAttribute {
	
	@Test(groups="Software company")
	public void infosys() {
		System.out.println("Infosys");
		
	}
	
	@Test(groups="Software company")
	public void wipro() {
		System.out.println("Wipro");
		
	}

	@Test(groups="Automobile")
	public void maruti() {
		System.out.println("Maruti");
		
	}
	
	@Test(groups="Automobile")
	public void tata() {
		System.out.println("TATA");
		
	}
}
