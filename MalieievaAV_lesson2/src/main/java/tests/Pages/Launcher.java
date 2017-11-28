package Pages;
//import java.util.List;
//import java.util.Properties;
//
//import org.eclipse.jetty.websocket.api.InvalidWebSocketException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import com.google.common.collect.TreeBasedTable;
//
//import utils.BaseTest;
//
//public class Launcher extends BaseTest{
//
////	public static void main(String[] args) throws InterruptedException {
////		
//////		useCaseLoginLogout(driver);
//////		checkAdminPanel(driver);
//////		closeDriver(driver);
////	}
////	
//
//	public static void useCaseLoginLogout(WebDriver driver)
//	{
//		useCaseLogin(driver);	
//		
//		try {
//			WebElement profileIcon = driver.findElement(By.className("employee_avatar_small"));
//			profileIcon.click();
//
//			Thread.sleep(1000);
//			
//			WebElement logOutOption = driver.findElement(By.id("header_logout"));
//			logOutOption.click();
//						
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void checkAdminPanel(WebDriver driver) throws InterruptedException
//	{
//		useCaseLogin(driver);	
//		
//		List<WebElement> admiPanel = driver.findElement(By.className("menu")).findElements(By.tagName("li"));
//		
//		for (WebElement item : admiPanel) {
//			item.click();
//			Thread.sleep(2000);
////			System.out.println(item.findElement(By.tagName("a")).findElement(By.tagName("span")).getText());
//			
//			String pageBeforeUpdate = driver.findElement(By.className("page-title")).getText();
//			System.out.println(pageBeforeUpdate);
//			driver.navigate().refresh();
//			
//			Thread.sleep(5000);
//			String currentPageAfterRfresh = driver.findElement(By.className("page-title")).getText();
//			if(pageBeforeUpdate.equals(currentPageAfterRfresh))
//				System.out.println(String.format("Actual page is {0}. Expected is {1}.", currentPageAfterRfresh, pageBeforeUpdate));
//			else 
//				System.out.println(String.format("Actual page is {0}. Expected is {1}.", currentPageAfterRfresh, pageBeforeUpdate));
//		}
//		
//	}
//	
//	public static void useCaseLogin(WebDriver driver)
//	{
//		try {
//			driver.get(" http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
//			Thread.sleep(5000);
//			
//			WebElement emailField = driver.findElement(By.id("email"));
//			emailField.sendKeys("webinar.test@gmail.com");
//			WebElement passwordField = driver.findElement(By.id("passwd"));
//			passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
//			WebElement submitBttn = driver.findElement(By.name("submitLogin"));
//			submitBttn.submit();
//			Thread.sleep(10000);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}
