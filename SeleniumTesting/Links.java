import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	


	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.wikipedia.org/");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Size = "+ links.size());
		
		for(int i=0;i<links.size();i++)
			System.out.println(links.get(i).getText() + ": "+ links.get(i).getAttribute("href"));
		
		System.out.println("---------BLOCK LINKS ---------------");
		
		WebElement globe = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[1]"));
		
		List<WebElement> links_globe = globe.findElements(By.tagName("a"));
		
		System.out.println("Globe Size : " + links_globe.size());
		
		for(int i=0; i<links_globe.size();i++)
			System.out.println(links_globe.get(i).getText() + ": " + links_globe.get(i).getAttribute("href"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
