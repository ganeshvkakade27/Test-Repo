package Day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	WebDriver driver;
	loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locators
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	
	
	//actions
	
	public void setusername(String name)
	{
		
		username.sendKeys(name);
	}
	
	public void setpassword(String pass)
	{
		password.sendKeys(pass);	
		
	}
	
	public void clicklogin()
	{
		loginbtn.click();
	}
	
	
}
