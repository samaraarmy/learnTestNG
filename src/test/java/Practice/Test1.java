package Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class Test1 {

	@Test()
    public void TC1() {
    	System.out.println("TC1");
    }
	@Test(enabled=false)
    public void TC2() {
		System.out.println("TC2");
    }
	@Test()
    public void TC3() {
		System.out.println("TC3");
    }
}
