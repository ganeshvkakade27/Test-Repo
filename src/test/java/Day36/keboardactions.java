package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keboardactions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='input1']")).sendKeys("Welcome");
		//Ctrl + A  select text
		//Ctrl+ C   copy text
		//tab  change the window
		//ctr+V  paste
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
			act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
			
 	}

}
