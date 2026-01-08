
package Day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenExel {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		//Get a File Path of excels
		String filepath=System.getProperty("user.dir")+"\\TestData\\BankData.xlsx";
		//once file get we have to find the how many rows in the file
		int rows=XLUtils.getRowCount(filepath, "Sheet1");
		
		//Reading the data from file
		for(int i=1;i<=rows;i++)
		{
			//Read data from excell
			String principle=XLUtils.getCellData(filepath, "Sheet1", i, 0);
			
			String roi=XLUtils.getCellData(filepath, "Sheet1", i, 1);
			String per1=XLUtils.getCellData(filepath, "Sheet1", i, 2);
			String per2=XLUtils.getCellData(filepath, "Sheet1", i, 3);
			String freq=XLUtils.getCellData(filepath, "Sheet1", i, 4);
			
			String maturityval=XLUtils.getCellData(filepath, "Sheet1", i, 5);
			//String expectR=XLUtils.getCellData(filepath, "Sheet1", i, 6);
			
			//pass data into application
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			//driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrop=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrop.selectByVisibleText(per2);
			
			Select fredrop=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrop.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();   //clicked on calculate button
			
			
		
			//do validations
			String calmatu=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();   //Calculate buttons
			
			if(Double.parseDouble(maturityval)==Double.parseDouble(calmatu))
			{
				System.out.println("Test is Passed.");
				
				XLUtils.setCellData(filepath, "Sheet1", i, 7,"Passed");
				XLUtils.fillGreenColor(filepath, "Sheet1", i, 7);
			}
			
			else
			{
				System.out.println("Test is Failed.");
				
				XLUtils.setCellData(filepath, "Sheet1", i, 7,"Failed");
				XLUtils.fillRedColor(filepath, "Sheet1", i, 7);
				
				
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();  //clear button clicked
			
		}
		
		
		
		
		
		driver.quit();
	}

}
