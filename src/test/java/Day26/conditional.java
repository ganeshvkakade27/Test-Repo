package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class conditional {
	
	
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
	driver.get("https://demo.nopcommerce.com");
	
	driver.manage().window().maximize();
	
	WebElement reg=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Register']")));
	
	reg.click();
	//driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	
	WebElement lo=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='nopCommerce demo store']")));
	
	//WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println("Display status of logo:"+lo.isDisplayed());
	
	WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	boolean t2=driver.findElement(By.xpath("//input[@id='gender-female']")).isEnabled();	
	boolean t3=driver.findElement(By.xpath("//input[@id='Email']")).isEnabled();
	//boolean t4=driver.findElement(By.xpath("//input[@id='password']")).isEnabled();
	
	
	System.out.println("Display status of gendermale :"+male.isEnabled());
	System.out.println("Display status of gendermale :"+male.isSelected());
	
	male.click();
	System.out.println("Display status of gendermale :"+male.isSelected());
	
	System.out.println("Display status of gender female:"+t2);
	System.out.println("Display status of email_address:"+t3);
	//System.out.println("Display status of password:"+t4);
	
	driver.close();
	
	
	}
	

}
