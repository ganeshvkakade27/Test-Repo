package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class google {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		
		String toll=driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).getAttribute("aria-label");
		Actions as=new Actions(driver);
	System.out.print("Title:"+toll);

		//as.moveToElement(ele).perform();
Thread.sleep(3000);

	//WebElement toll=driver.findElement(By.xpath("//div[@aria-label='Search by voice']//*[name()='svg']"));
		
	Assert.assertEquals(toll, "Search by Voice");
		
	}

}
