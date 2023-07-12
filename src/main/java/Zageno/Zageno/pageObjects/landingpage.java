package Zageno.Zageno.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	
	WebDriver driver;
	
	
	public landingpage(WebDriver driver){
		// Initialization code
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//driver.findElement(By.xpath("//div[@class='MuiBox-root css-1bs8rlt']//a[@class='MuiButtonBase-root MuiButton-root MuiButton-secondary MuiButton-secondaryPrimary MuiButton-sizeMedium MuiButton-secondarySizeMedium MuiButton-root MuiButton-secondary MuiButton-secondaryPrimary MuiButton-sizeMedium MuiButton-secondarySizeMedium css-j7u9b9'][normalize-space()='Log In']")).click();
    // Page factory
	
	@FindBy(xpath="//div[@class='MuiBox-root css-1bs8rlt']//a[@class='MuiButtonBase-root MuiButton-root MuiButton-secondary MuiButton-secondaryPrimary MuiButton-sizeMedium MuiButton-secondarySizeMedium MuiButton-root MuiButton-secondary MuiButton-secondaryPrimary MuiButton-sizeMedium MuiButton-secondarySizeMedium css-j7u9b9'][normalize-space()='Log In']")
	WebElement LoginLink;
	
	@FindBy(id="idp-discovery-username")
	WebElement LoginID;
	
	@FindBy(id="idp-discovery-submit")
	WebElement LoginSubmit;
	
	@FindBy(xpath="//input[@id='okta-signin-password']")
	WebElement Password;
	
	
	@FindBy(id="okta-signin-submit")
	WebElement PassSubmit;
	
	public void loginApp(String email,String password)
	{
		
		LoginLink.click();
		LoginID.sendKeys(email);
		LoginSubmit.click();
		Password.sendKeys(password);
		PassSubmit.click();
		
	}
	
	
	  public void goTO()
	  {
	  
	  driver.get("https://staging.zageno.com/"); }
	 
}
