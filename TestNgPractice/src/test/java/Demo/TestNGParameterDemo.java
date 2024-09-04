package Demo;

import org.testng.annotations.*;


public class TestNGParameterDemo {

	@Test
	@Parameters({"i","j"})
	public void add(int a,int b) {
		System.out.println("Add:" + (a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void subtraction(int a,int b) {
		System.out.println("Subtraction:" + (a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multiply(int a, int b) {
		System.out.println("Multiply:" + (a*b));
	}
}
