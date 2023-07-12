package Zageno.Zageno;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Zageno.Zageno.pageObjects.landingpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class popUpBlock {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions opt=new ChromeOptions();
	
	opt.setExperimentalOption("excludeSwitches", Arrays.asList("disabled-popup-blocking"));
	
	WebDriver driver =new ChromeDriver(opt);
	
	driver.get("https://staging.zageno.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	// Landing page
	
	/*
	 * landingpage landingpage = new landingpage(driver); landingpage.goTO();
	 * 
	 * landingpage.loginApp("debug+sel11@zageno.com","X5mDN/)smb/,vF:w");
	 */
	}
	
				

}
