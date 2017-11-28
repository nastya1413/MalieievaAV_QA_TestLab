package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	private WebDriver driver;

	private By userIcon = By.id("emploee_infos");
	private By exitItem = By.id("header_logout");
	
	public DashboardPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void clickOnUserIcon(){
		driver.findElement(userIcon).click();
	}
	
	public void clickOnExitIcon(){
		driver.findElement(exitItem).click();
	}
}
