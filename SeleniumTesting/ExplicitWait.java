import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement user_name = driver.findElement(By.id("email"));
		user_name.sendKeys("1989minu@gmail.com");
		
		WebElement Pass = driver.findElement(By.id("pass"));
		Pass.sendKeys("weerwer");
		
		driver.findElement(By.id("u_0_2")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div"))).getText();
		System.out.println(message);
		
		
		/*try{
		System.out.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
			
		} */
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12wewe");
		
		
	}

}
