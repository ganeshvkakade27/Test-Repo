package Day29;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tstingpara {

	public static void main(String args[])
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		
		 List<WebElement> hlinl=driver.findElements(By.xpath("//h4[text()='Laptop Links']/following-sibling::*"));
		 
		 System.out.println(hlinl.size());
		
		
		driver.close();
		
		
		
	}
	
	
}
