package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepick {
	
	
	static void future(WebDriver driver,String month,String Date,String Year)
	{
		
		while(true)
		{
			//Thread.sleep(2000);
			String acm=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ayea=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(acm.equals(month) && ayea.equals(Year))
			{
				break;
			}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		
		
		//Selection of dates
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dd:dates)
		{
			if(dd.getText().equals(Date))
			{
				dd.click();
				break;
			}
		}
			
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//method 1 manually
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/22/2025");
		
		
		//mathod 2  using datepicker
		
		String month="June";
		String Date="29";
		String Year="2027";
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		future(driver,month,Date,Year);
		
		
		
		
		
		
	}

}
