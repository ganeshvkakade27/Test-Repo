package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class sliderl {
	
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		WebElement min=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		WebElement max=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Before"+min.getLocation());   //59,251
		System.out.println("Before MAx:"+max.getLocation());
	Actions act=new Actions(driver);
	act.dragAndDropBy(min, 100, 251).build().perform();
	Action ac=act.dragAndDropBy(max, -100, 251).build();
		
	ac.perform();
	System.out.println("After"+min.getLocation());
	System.out.println("After max:"+max.getLocation());
	
	}
}
