package Day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zooming {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		Thread.sleep(3000);

		js.executeScript("document.body.style.zoom='50%'");

		Thread.sleep(3000);

		js.executeScript("document.body.style.zoom='80%'");

		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='200%'");
		
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");

	
	}

}
