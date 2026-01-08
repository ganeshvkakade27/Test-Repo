package Day30;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FrameClassTEst {
	
	
	public static void main(String args[])
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		
		WebElement myframe1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(myframe1);   // moving to frame 1
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Ganesh Kumar");
		
		driver.switchTo().defaultContent();
		
		WebElement myframe2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(myframe2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("vilas Kumar");
		
		FluentWait<WebDriver> wait=new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(30));//max timeout
		wait.pollingEvery(Duration.ofMillis(3000)); //polling frequesny
		wait.ignoring(NoSuchElementException.class); //ignoring exception
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_3.html']")));
		
		
	
		WebElement myframe3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(myframe3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		//here driver is in the frame3  then only 1 inner iframe we index concepts
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@id='i24']//div[contains(@class,'uHMk6b fsHoPb')]")).click();
		
		
		
		
		
	
	}

}
