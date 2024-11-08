package Practice;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups = {"sanity"})
    public void TC4() {
    	System.out.println("TC4");
    }
	@Test(groups = {"Regression","sanity"})
    public void TC5() {
		System.out.println("TC5");
    }
	@Test(groups = {"Regression","sanity","functional"})
    public void TC6() {
		System.out.println("TC6");
    }
	@Test(groups = {"smoke","sanity"})
    public void TC7() {
		System.out.println("TC7");
    }
}
