package Day29;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String base=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
		
		Set<String> handle=driver.getWindowHandles();
		
		for(String windhan:handle)
		{
			if(!windhan.equals(base))
				{
					driver.switchTo().window(windhan);
				
				}
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='new_session_username']")).sendKeys("Ganeshvkakade");
		
		driver.findElement(By.xpath("//input[@id='new_session_password']")).sendKeys("Abc@123");
			
		driver.findElement(By.xpath("//button[@id='sign_in']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(base);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("location.reload()");
		
		String til=js.executeScript("return document.title;").toString();
		System.out.println("Title=::"+til);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selennium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
	}

}
