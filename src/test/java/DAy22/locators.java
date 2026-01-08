package DAy22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();

		driver.get("https://demo.opencart.com");
		//maximize browser window
		driver.manage().window().maximize();
		
		//name
		
		//driver.findElement(By.name("search")).sendKeys("mobile");
		
		
		//id
		//boolean logostatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println("Logo present:"+logostatus);
		
		//linkText and partialLinkText
		
		// driver.findElement(By.linkText("Software")).click();
		//driver.findElement(By.linkText("Tablets")).click();
		
		//driver.findElement(By.linkText("Desktops")).click();
	


        
		//classname
		//List<WebElement> hlink=driver.findElements(By.className("list-inline-item"));


	
		//tagname
		List<WebElement> tlnk =driver.findElements(By.tagName("a"));//total link
		System.out.println("Total number of links:"+tlnk.size());		
		
		List<WebElement> im=driver.findElements(By.tagName("img"));  //total images
		System.out.println("Total number of images:"+im.size());
		
	}
		
		
		
		
	}
