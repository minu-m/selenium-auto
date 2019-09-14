import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);		
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']"));
		
		int width = slider.getSize().width/2;
		action.dragAndDropBy(slider, width, 0).perform();

	}

}
