package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdownTest {

	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//select the dropdown
		
		WebElement selectdr=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select ele=new Select(selectdr);
		
		
		ele.selectByVisibleText("Canada");
		Thread.sleep(3000);
		ele.selectByValue("germany");
		Thread.sleep(3000);
		ele.selectByIndex(2);
		
		List<WebElement> options=ele.getOptions();
		System.out.print("Tatal options are:"+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}
	
	
}
