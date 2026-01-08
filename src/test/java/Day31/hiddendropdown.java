package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendropdown {
	
	
	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//login Steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//move to pim tab
				driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
				
			//	driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']"));
		
				driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();

				List<WebElement> opt=driver.findElements(By.xpath("//div[@role='listbox']//span"));
				System.out.println("size"+opt.size());
				
				for(WebElement op:opt)
				{
					System.out.println(op.getText());
				}
	}

}
