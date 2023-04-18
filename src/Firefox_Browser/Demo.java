package Firefox_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String args[]) throws InterruptedException {
		
		//FirefoxOptions option=new FirefoxOptions();
		//option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.geco.driver","C:\\Files\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("monitors");
		driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]")).click();
		driver.close();
		driver.findElements(By.xpath("(//img[@class='_396cs4'])[1]"));
		List<WebElement> Links = driver.findElements(By.xpath("(//img[@class='_396cs4'])"));
		int noOfLinks = Links.size();
		String path = "(//img[@class='_396cs4'])";
		
		for(int i=1;i<=noOfLinks;i++) {
			String elementpath =path+"["+i+"]";
			driver.findElement(By.xpath(elementpath)).click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
//		
	}

}
