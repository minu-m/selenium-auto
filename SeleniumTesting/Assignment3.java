import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='pollform']/table/tbody/tr[2]/td/input[1]")).click();
		
		
		
	    String captcha = driver.findElement(By.xpath("//*[@id='mathq2']")).getText();
	    
	    String strArray[] = captcha.split(" ");
		System.out.println(strArray[0]);
		
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[2]);
		int c = 0;
		
		String op = strArray[1];
		System.out.println("Operator =" +op+"*");
		
		
		
		if(op.equals("+")){
			System.out.println("Entered if");
			c = a + b;
			System.out.println("Answer : " +c);	
			String ans=Integer.toString(c);
			driver.findElement(By.id("mathuserans2")).sendKeys(ans);
			
		}
		
		else if(op.equals("-")){
			
			c = a - b;
			System.out.println("Answer : " +c);	
			
		}
		
		else if(op.equals("x")){
			
			c = a*b;
			System.out.println("Answer : " +c);	
		}
			
		driver.findElement(By.className("homesprite")).click();
		
		
		
		
		
		

	}

}
