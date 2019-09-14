import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webbrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Minu\\Selenium\\SeleniumTesting\\chromedriver.exe");
		
		//WebDriverManager.ChromeDriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		try{
		WebElement No_thanks = driver.findElement(By.className("gb_xa"));
		No_thanks.click();
		}
		
catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search_bar = driver.findElement(By.name("q"));
		search_bar.sendKeys("Cat Videos");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*WebElement lucky = driver.findElement(By.name("btnI"));
		lucky.click(); */
		
		driver.findElement(By.name("btnK")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
		}
		
		catch(Exception e){
		
			System.out.println(e.getMessage());
		}
		
		
		//driver.close();
	}

}
  