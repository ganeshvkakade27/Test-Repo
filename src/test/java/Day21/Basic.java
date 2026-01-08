package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebDriver;


public class Basic {
	
	//Create a chrome driver class
	
	public static void main(String[] args) throws InterruptedException
	{
		//1.open chrome
		//ChromeDriver driver=new ChromeDriver();  //use to launch the chrome
		WebDriver Driver=new ChromeDriver();   //webdriver is parent interface 
		
		//WebDriver Driver=new EdgeDriver();
		
		//2.open url https://demo.opencart.com
		Driver.get("https://demo.opencart.com/");
		
		Driver.manage().window().maximize();
		//3. Validate the title "Your Store"
		
		Thread.sleep(5000);
		String ti=Driver.getTitle();
		
		if(ti.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
			System.out.println("Test Failed");

		//Closing the browers
		Driver.quit();
		//Driver.close();
	}

		
	}


