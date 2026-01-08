package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlerts {

	
	public static void main(String args[]) throws InterruptedException
	{
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
	
		//Normal Alert with OK button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		
		Alert myalert=driver.switchTo().alert();
		System.out.println("Alert Text:"+myalert.getText());
		Thread.sleep(5000);
		myalert.accept();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); // close the alert using OK button
		driver.switchTo().alert().dismiss();//close the alert window using cancle button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Alert mypalrt=driver.switchTo().alert();
		mypalrt.sendKeys("Ganesh.kakade Welcome to Harman Pune");
		Thread.sleep(2000);
		mypalrt.accept();
		
		
		
		driver.close();
	
	}
}
