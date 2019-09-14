import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/way2auto_jquery/index.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("name")).sendKeys("Minu M");
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select country_dropdown = new Select(country);
		
		country_dropdown.selectByValue("Iceland");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try{
		driver.findElement(By.xpath("//*[@id='load_form']/div/div[2]/input")).submit();
		}
		
		catch(Throwable t){
			
			System.out.println(t.getMessage());
		}
		
		
		
		
	}

}
