package Firefox_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_Suggesive_dropdown {
	public static void main(String args[]) {
		System.setProperty("webdriver.geco.driver","C:\\Files\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.makemytrip.com/");
		 
	}

}
