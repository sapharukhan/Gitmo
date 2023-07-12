package Zageno.Zageno;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Zageno.Zageno.pageObjects.landingpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class submitOrderTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.zageno.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		// Landing page
		
		landingpage landingpage = new landingpage(driver);
		landingpage.goTO();
		
		landingpage.loginApp("debug+sel11@zageno.com","X5mDN/)smb/,vF:w");
		
		
		// ID- debug+sel11@zageno.com
		// Pass-X5mDN/)smb/,vF:w
		/*
		 * driver.findElement(By.
		 * xpath("//div[@class='MuiBox-root css-1bs8rlt']//a[@class='MuiButtonBase-root MuiButton-root MuiButton-secondary MuiButton-secondaryPrimary MuiButton-sizeMedium MuiButton-secondarySizeMedium MuiButton-root MuiButton-secondary MuiButton-secondaryPrimary MuiButton-sizeMedium MuiButton-secondarySizeMedium css-j7u9b9'][normalize-space()='Log In']"
		 * )).click(); driver.findElement(By.id("idp-discovery-username")).sendKeys(
		 * "debug+sel11@zageno.com");
		 * 
		 * driver.findElement(By.id("idp-discovery-submit")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='okta-signin-password']")).sendKeys(
		 * "X5mDN/)smb/,vF:w");
		 * 
		 * driver.findElement(By.id("okta-signin-submit")).click();
		 */
	    Thread.sleep(10000);
	    
	    driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[1]/div[3]")).click();
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();  
	  
	    
	    ////input[@type='submit']
	    //driver.findElement(By.tagName("Marketplace")).click();
	    
	    driver.findElement(By.cssSelector(".MuiTypography-root.MuiTypography-inherit.MuiLink-root.MuiLink-underlineNone.css-6vje94")).click();
	    
	    //CollectionPage
	    
	    driver.findElement(By.xpath("//a[contains(@title,'GainShareProduct')]//div[contains(@class,'product__cta-buy')][normalize-space()='View & Buy']")).click();
	    
	    
	    Select qty = new Select(driver.findElement(By.cssSelector(".MuiNativeSelect-select.MuiNativeSelect-standard.MuiInputBase-input.MuiInput-input.css-7ypv5o")));
	    
	    qty.selectByValue("2");
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']")).click();
	    
	    
	    
	     // Mouse over and click on 
	    
	    //Instantiate Action Class
	    
		/*
		 * Actions actions = new Actions(driver); //Retrieve WebElement' to perform
		 * mouse hover WebElement menuOption = driver.findElement(By.
		 * xpath("//a[@data-testid='cart-button']//span[@class='MuiBadge-root css-1rzb3uu']//*[name()='svg']"
		 * )); //Mouse hover menuOption 'Music'
		 * actions.moveToElement(menuOption).perform();
		 */
    	
    	//driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-primary.MuiButton-primaryPrimary.MuiButton-sizeMedium.MuiButton-primarySizeMedium.MuiButton-root.MuiButton-primary.MuiButton-primaryPrimary.MuiButton-sizeMedium.MuiButton-primarySizeMedium.css-1p9iac")).click();
	  
    	driver.findElement(By.id("single-spa-application:@zageno/header")).click();
    	// Checkoutpage
    	
    	driver.findElement(By.xpath("//input[@id='id_po_number']")).sendKeys("1234");
    	
        Select newcost = new Select(driver.findElement(By.xpath("//input[@aria-label='Select']")));
        
        newcost.selectByVisibleText("New Cost Center");
    	
    	driver.findElement(By.xpath("//input[@name='checkout']")).click();
    	
    	
	
	}
	
	

}



