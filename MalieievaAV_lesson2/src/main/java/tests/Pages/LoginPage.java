package Pages;


import utils.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;

private By emailField = By.id("email");
private By passwordField = By.id("passwd");
private By submitBttn = By.name("submitLogin");

	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void open(){
		driver.get(Properties.getBaseAdminURL());
	}
	
	public void fillEmailField(){
		driver.findElement(emailField).sendKeys("webinar.test@gmail.com");
	}
	
	public void fillPasswField(){
		driver.findElement(passwordField).sendKeys("Xcg7299bnSmMuRLp9ITw");
	}
	
	public void clickSubmit(){
		driver.findElement(submitBttn).submit();
	}

}
