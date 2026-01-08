package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledropdown {


	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	//List<WebElement> li=driver.findElements(By.xpath("//div[@id='Alh6id']"));	
	
	//.out.println(li.size());
	
	//for()
	//List<WebElement> opt=driver.findElement(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

	System.out.println("Size:"+opt.size());
	for(WebElement op:opt)
	{
		System.out.println(op.getText());
	}
	for (int i=0;i<opt.size();i++)
	{
		if(opt.get(i).getText().equals("selenium download"))
				{
				opt.get(i).click();
				break;
				}
	}
	
	
	}
	
	
	
	
}

