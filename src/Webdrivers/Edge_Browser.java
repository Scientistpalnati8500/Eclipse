package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Files\\Eclipse-Workspace\\Selenium_Project\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.qafox.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("s")).sendKeys("manual testing interviwe qusstions and answers");
		driver.findElement(By.id("search-submit")).click();
		driver.navigate().back();
		
		driver.close();
		

	}

}
