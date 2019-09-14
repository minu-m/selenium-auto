package TestSuite1;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario1 {

	@Test(priority=2, dependsOnMethods="doReg",alwaysRun=true, groups="ui")
	public void  dologin(){
		
		System.out.println("Login succesful");
		
	}
	
	@Test(priority=1, groups="ui")
	public void doReg(){
		
		System.out.println("Registration succesful");
		Assert.fail();
	}
	
	@Test(priority = 3, groups="functional")
	public void title(){
		
		SoftAssert softAssert = new SoftAssert();
		String expected_title = "gmail.com";
		String actual_title = "yahoo.com";
		
		softAssert.assertEquals(expected_title, actual_title);
		
		System.out.println("Next assertion");
		softAssert.assertEquals(true, false);
		
		softAssert.assertAll();
	}
}
