import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Thread.sleep(5000);
		
		//2nd window
		
		Set <String> winids = driver.getWindowHandles();
		
		Iterator <String> iterate = winids.iterator();
		
		String first_window = iterate.next();
		String second_window = iterate.next();
/*		System.out.println(winids.iterator().next());
		String second_window = winids.iterator().next();
		String third_window = winids.iterator().next(); */
		System.out.println("First : "+first_window);
		System.out.println("SECOND  : " +second_window);
		
		driver.switchTo().window(second_window);
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		
		/*winids = driver.getWindowHandles();
		
		iterate = winids.iterator();
		
		iterate.next();
		iterate.next();
		String third_window = iterate.next();
		System.out.println("Third :" + third_window);
		System.out.println(third_window.isEmpty());
		
		driver.switchTo().window(third_window); */
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td/table[2]/tbody/tr/td[1]/p/a"))).click();
		
		
		
		//looks like same window
		
		/*String third_window = iterate.next();
		System.out.println("Third  : " +third_window);
		
		driver.switchTo().window(third_window); */
		
		//driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td/table[2]/tbody/tr/td[1]/p/a")).click();
		
		//3rd window
		
		//driver.getTitle(); 
		

	}

}
