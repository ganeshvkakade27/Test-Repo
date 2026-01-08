package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsTest {
	
	public static void main(String args[])
	{
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	
		driver.manage().window().maximize();
		
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		//1. Takes screenshot of full page
		/*
		 File sf=ts.getScreenshotAs(OutputType.FILE);
		
		File tf=new File(System.getProperty("user.dir")+"\\Screenshots\\fulpage.png");
		sf.renameTo(tf);
		
		*/

		//Takes screenshot of specific webelement
		
		WebElement pagetable=driver.findElement(By.xpath("//div[@id='HTML8']"));	
		File SF=pagetable.getScreenshotAs(OutputType.FILE);	
		File TF=new File(System.getProperty("user.dir")+"\\Screenshots\\page.png");
		SF.renameTo(TF);   //copy to target file
		
		
		
		
	
	}

}
