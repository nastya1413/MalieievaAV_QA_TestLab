package Pages;


import utils.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage {
//private WebDriver driver;

private EventFiringWebDriver driver;
private By emailField = By.id("email");
private By passwordField = By.id("passwd");
private By submitBttn = By.name("submitLogin");
private String email = "webinar.test@gmail.com";
private String passw = "Xcg7299bnSmMuRLp9ITw";

	public LoginPage(EventFiringWebDriver driver){
		this.driver = driver;
	}
	
	public void open(){
		driver.get(Properties.getBaseAdminURL());
	}
	
	public void fillEmailField(){
		driver.findElement(emailField).sendKeys(email);
	}
	
	public void fillPasswField(){
		driver.findElement(passwordField).sendKeys(passw);
	}
	
	public void clickSubmit(){
		driver.findElement(submitBttn).submit();
	}

}
