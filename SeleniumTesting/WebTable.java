import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List <WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total no. of rows : " +rows.size());
		
		List <WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total no. of cols : " +cols.size());
		
		for(int h=1; h<=headers.size();h++)
			System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+h+"]")).getText()+" ");
		
		System.out.println();
		
		for(int i=1; i<=5;i++){
			
			for(int j=1; j<=cols.size();j++){
				
				String cell = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(cell + " ");
			}
			
			System.out.println(" ");
		}
	}

}
