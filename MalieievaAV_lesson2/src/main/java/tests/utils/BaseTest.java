package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseTest {
	public static WebDriver initDriver()
	{
		String browser = Properties.getBrowser();
		switch(browser){
			case "firefox": 
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				return new FirefoxDriver();
			case "chrome": 
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				return new ChromeDriver();
			default: 
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				return new ChromeDriver();
		}
	}
	
	public static WebDriver getConfiguredDriver(){
		WebDriver driver = initDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeDriver(WebDriver driver)
	{
		driver.close();
	}
	
}
