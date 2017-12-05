package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Constants;

public class ActionKeyWords {
	
	public static WebDriver driver;
	
	
	public static void openBrowser(){
		
		driver=new FirefoxDriver();
	}
	
	public static void navigate(){
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constants.baseURL);
	}
	
	public static void click_MyAccount(){
		driver.findElement(By.xpath(".//*[@id='account']/a/span[1]")).click();
		
	}
	
	public static void input_Username(){
		
		driver.findElement(By.id("log")).sendKeys(Constants.userName);
	}
	
	public static void input_Password(){
		
		driver.findElement(By.id("pwd")).sendKeys(Constants.password);
		
	}
	
	public static void click_Login(){
		
		driver.findElement(By.id("login")).click();
		
	}
	
	
	public static void click_Logout(){
		
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	}

	public static void closeBrowser(){
		
		driver.quit();
	}

	





}
