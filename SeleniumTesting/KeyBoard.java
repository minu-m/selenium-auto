import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:gmail.com");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='view_container']/div/div")).click();
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		
	}

}
