package Firefox_Browser;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Click_OneByOne_And_NavigateBack {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.geco.driver","C:\\Files\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		Thread.sleep(3000);
		
		List<WebElement> Links = driver.findElements(By.xpath("(//a[@class='oxd-main-menu-item'])"));
		int noOfLinks = Links.size();
		String path = "(//a[@class='oxd-main-menu-item'])";
		
		for(int i=1;i<=noOfLinks;i++) {
			String elementpath =path+"["+i+"]";
			driver.findElement(By.xpath(elementpath)).click();
			driver.manage().window().fullscreen();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		
		driver.close();
	}
}
