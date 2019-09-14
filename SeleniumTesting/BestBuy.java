import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuy {

	int count=0;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Minu\\Selenium\\SeleniumTesting\\chromedriver.exe");
		//WebDriverManager.ChromeDriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.className("us-link")).click();
		
	//	driver.findElement(By.className("close")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal fade email-submission-modal in")));
		
		/* String parentWindow = driver.getWindowHandle();
		String subWindow = null;
		Set <String> handles = driver.getWindowHandles();
		
		Iterator <String> iterate = handles.iterator();
		
		while (iterate.hasNext()){
			
			subWindow = iterate.next();
			int count = 0;
			count++;
			System.out.println("Count ---" +count); 
		} */
		
			
		//String first_window = iterate.next();
		//String second_window = iterate.next();
		
		driver.switchTo().defaultContent();

		
		//driver.findElement(By.xpath("//*[@id='modal901']/div/div/div[1]/button")).click();
		
		driver.findElement(By.className("size-l bby-ghp modal-open")).click();
		
		driver.findElement(By.id("gh-search-input")).sendKeys("Diaper bag");
		
		driver.close();

	}

}
