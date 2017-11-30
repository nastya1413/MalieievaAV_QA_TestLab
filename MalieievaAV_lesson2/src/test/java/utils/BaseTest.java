package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

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
	
	public static EventFiringWebDriver getConfiguredDriver(){
		WebDriver driver = initDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EventFiringWebDriver wDriver = new EventFiringWebDriver(driver);
		wDriver.register(new EventHandler());
		return wDriver;
	}
	
	public static void closeDriver(WebDriver driver)
	{
		driver.close();
	}
	
}
