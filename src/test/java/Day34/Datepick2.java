package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepick2 {
	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		String Year="2030";
		String Month="Sep";
		String Date="27";
		
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Select year']"));  //select Year
		Select ele=new Select(year);
		ele.selectByVisibleText(Year);
		
		WebElement mon=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select ele1=new Select(mon);
		ele1.selectByVisibleText(Month);
		
		List <WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		
		for(WebElement dd:dates)
		{
			if(dd.getText().equals(Date))
			{
				dd.click();
				break;
			}
		}
		
	
	
	}
	
	
	
}
