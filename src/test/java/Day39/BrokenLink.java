package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLink {
	


	public static void main(String[] args) throws IOException {
		
		WebDriverWait wait;
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://testautomationpractice.blogspot.com/");
	
	
	     wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		List<WebElement> lin=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='broken-links']//a")));
	
		
		//List<WebElement> lin=driver.findElements(By.xpath("//div[@id='broken-links']//a"));   //capture all the link
		
		System.out.println("Total Links:"+lin.size());
		
		int bl=0;
		
		for(WebElement hreflink:lin)
		{
			String att=hreflink.getAttribute("href");    //get link 
			
			if(att==null ||att.isEmpty())    //check its empty or not
			{
				System.out.println("Href attribute is empty or Null");    
				continue;
			}
			
			//hit URL to server
		
			try
			{
			URL linkURL=new URL(att);    //convert string to URL for click
			HttpURLConnection conurl=(HttpURLConnection) linkURL.openConnection();   //open connection to server
			conurl.connect();  //connect and hit the URL and sent to server
			
			if(conurl.getResponseCode()>=400)    //GEt Status code
			{
				System.out.println("Its a Broken Link:==>"+att);
				bl++;
			}
			else{
				System.out.println("Its not a broken Link:==>"+att);
				
			}
			
			}catch(Exception e)
			{
				
			}
		}
		System.out.println("Totla no of Broken Link:"+bl);
		
		driver.quit();
	}

}
