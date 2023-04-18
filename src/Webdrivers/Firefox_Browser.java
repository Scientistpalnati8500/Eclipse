package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Files\\Eclipse-Workspace\\Main_Selenium_Project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.qafox.com/");
		Thread.sleep(3000);                  //time delay
		driver.manage().window().maximize();
		driver.findElement(By.id("s")).sendKeys("manual testing interviwe qusstions and answers");
		driver.findElement(By.id("search-submit")).click();
		driver.navigate().back();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(0, 5000)");
	    Thread.sleep(2000);
		
		driver.close();

	}
	
}
