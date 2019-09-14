import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {

	
	public static WebDriver driver;
	public static boolean isElementPresent(String locator){
		try{
		driver.findElement(By.xpath(locator));
		return true;
		}
		
		catch(Throwable t){
			return false;
		}
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(isElementPresent("//*[@id=\"js-link-box-en\"]"));
		

	}

}
