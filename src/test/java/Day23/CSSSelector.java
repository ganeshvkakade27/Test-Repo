package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	
	
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		driver.getCurrentUrl();
		//Syste
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("TShirts");
		
		//driver.findElement(By.cssSelector("button.search-box-button")).click();
		
		//driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Towel");
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Ganesh");
		
		
		driver.findElement(By.xpath("//div[@id='menu-1']")).click();
		
		driver.close();
		
		
		
	}

}
