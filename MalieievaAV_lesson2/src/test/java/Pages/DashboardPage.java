package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class DashboardPage {
	private WebDriver driver;

	private By userIcon = By.id("employee_infos");
	private By exitItem = By.id("header_logout");
	private By orderTab = By.id("subtab-AdminParentOrders");
	
	public DashboardPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void clickOnUserIcon(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(userIcon));
		driver.findElement(userIcon).click();
	}
	
	public void clickOnExitIcon(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(exitItem));
		driver.findElement(exitItem).click();
	}
	
	public void clickLogoutButtonWithJS(){
		WebElement element = driver.findElement(exitItem);
		JavascriptExecutor exec = (JavascriptExecutor)driver;
		exec.executeScript("arguments[0].click()", element);
	}
	
	public void scrollPageDown(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(userIcon));
		JavascriptExecutor exec = (JavascriptExecutor)driver;
		
		exec.executeScript("window.scrollBy(0,500)");
	}
	
	public void selectsubMenuItem(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(userIcon));
		
		WebElement orderTabElement = driver.findElement(orderTab);
		Actions actions = new Actions(driver);
		actions.moveToElement(orderTabElement).build().perform();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("subtab-AdminOrders")));
		orderTabElement.findElements(By.cssSelector("li")).get(0).click();
	}
}
