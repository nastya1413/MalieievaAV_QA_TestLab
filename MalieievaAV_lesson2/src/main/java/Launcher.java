import org.eclipse.jetty.websocket.api.InvalidWebSocketException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.TreeBasedTable;

public class Launcher {

	public static void main(String[] args) {
		WebDriver driver = initChromeDriver();
		useCaseLoginLogout(driver);
		closeDriver(driver);
	}
	
	public static WebDriver initChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		return new ChromeDriver();
	}
	
	public static void closeDriver(WebDriver driver)
	{
		driver.close();
	}
	
	public static void useCaseLoginLogout(WebDriver driver)
	{
		useCaseLogin(driver);	
		
		try {
			WebElement profileIcon = driver.findElement(By.className("employee_avatar_small"));
			profileIcon.click();

			Thread.sleep(1000);
			
			WebElement logOutOption = driver.findElement(By.id("header_logout"));
			logOutOption.click();
						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void useCaseLogin(WebDriver driver)
	{
		try {
			driver.get(" http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
			Thread.sleep(5000);
			
			WebElement emailField = driver.findElement(By.id("email"));
			emailField.sendKeys("webinar.test@gmail.com");
			WebElement passwordField = driver.findElement(By.id("passwd"));
			passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
			WebElement submitBttn = driver.findElement(By.name("submitLogin"));
			submitBttn.submit();
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
