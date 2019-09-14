import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		Actions action = new Actions(driver);
		action.contextClick(img).perform();
		
		WebElement product = driver.findElement(By.id("dm2m1i1tdT"));
		action.moveToElement(product).perform();
		
		WebElement installation = driver.findElement(By.id("dm2m2i1tdT"));
		action.moveToElement(installation).perform();
		
		driver.findElement(By.id("dm2m3i1tdT")).click(); 
		
	 

	}

}
