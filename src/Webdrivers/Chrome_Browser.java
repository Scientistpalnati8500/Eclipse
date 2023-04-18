package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Files\\Eclipse-Workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qafox.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("s")).sendKeys("manual testing interviwe qusstions and answers");
		driver.findElement(By.id("search-submit")).click();
		driver.navigate().back();
		
		driver.close();
	}

}
