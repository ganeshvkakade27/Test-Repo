package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileupload {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\gkakade\\Desktop\\Students.txt");
		
		WebElement ele=driver.findElement(By.xpath("//ul[@id='fileList']//li"));
		if(ele.getText().equals("Students.txt"))
		{
			System.out.println("File is successfully uploaded");
			
		}
		
		else
		{
			System.out.println("File uploading is failed");
		}
		

		driver.quit();
	}

}
