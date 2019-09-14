import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		WebElement lang = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(lang);
		
		select.selectByValue("fa");
		
		List<WebElement> options = driver.findElements(By.tagName("option"));
		
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++)
			System.out.println(options.get(i).getText()+" : " + options.get(i).getAttribute("lang"));
		
		
		

	}

}
