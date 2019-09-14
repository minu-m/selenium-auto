ximport java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='iframeResult']")));
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().defaultContent();
		
		List <WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println("No. of frames : " + frames.size());
		
		for(WebElement frame : frames){
			
			System.out.println(frame.getAttribute("id"));
		}
			
		
		
		
	}

}
