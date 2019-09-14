import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkRadio {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement exp = driver.findElement(By.id("exp-3"));
		exp.click();
		
		try{
		List <WebElement> prof = driver.findElements(By.name("profession"));
		System.out.println(prof.size());
		
		
		
        int count = 0;
		for(int i=0;i<prof.size();i++)
		{
			WebElement tester = prof.get(i);
			tester.click();
			count++;
			System.out.println("Count :" +count);
			
		}
			}
		
		catch(Throwable t){
			System.out.println(t.getMessage());
		}
	
WebElement continent = driver.findElement(By.id("continents"));
		
		Select check = new Select(continent);
		check.selectByVisibleText("Australia");
		
			
		
		
		
		
		
		

	}

}
