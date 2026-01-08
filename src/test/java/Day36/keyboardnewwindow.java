package Day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardnewwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
		
		//swtiching to registations page
		
		Set<String>ids=driver.getWindowHandles();   //used to get the handles of windows
		
		List<String> lista=new ArrayList(ids);
		
		driver.switchTo().window(lista.get(1));   //switch to registartion page
		
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ganesh");
		
		driver.switchTo().window(lista.get(0));   //switch to main
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");
		
		
		
		
	}

}
