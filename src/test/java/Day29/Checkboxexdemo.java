package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexdemo {
	
	
	public static void main(String args[])
	{
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> check=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(WebElement checkb:check)
		{
			checkb.click();
		}
		
		for(int i=0;i<check.size();i++)
		{
			if(check.get(i).isSelected())
			check.get(i).click();
		}
		
	}

}
