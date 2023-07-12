package Zageno.Zageno.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	
	
WebDriver driver;
	
	
	public productpage(WebDriver driver){
		// Initialization code
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
