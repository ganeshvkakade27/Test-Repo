package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpages {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://datatables.net/examples/basic_init/alt_pagination.html");
		driver.manage().window().maximize();
		
		String text=driver.findElement(By.xpath("//div[@id='example_info']")).getText();
		
		System.out.println("String:"+text);
		
		int pages=Integer.parseInt(text.substring(text.indexOf("of")+3,text.indexOf("entries")-1));
		//static int p=1;
System.out.println("Total numner of pages:"+pages);
		
		for(int p=1;p<=6;p++)
		{
			if(p>1)
			{
					WebElement active=driver.findElement(By.xpath("//div[@class='dt-paging']//*[text()="+p+"]"));
					active.click();
				
					//Reading data from page
				
					//row
			int row=driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
			
			int col=6;
			
			for(int r=1;r<=row;r++)
			{
				for(int c=1;c<=col;c++)
				{
					String value=driver.findElement(By.xpath("//table[@id='example']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(value+" \t");
				}
				System.out.println();
			}
			
			}
			
			System.out.println("\n\nNew Page Data\n\n");
		}
		
		
	}

}
