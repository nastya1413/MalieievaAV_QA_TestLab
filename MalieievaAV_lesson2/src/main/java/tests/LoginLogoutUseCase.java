//package tests;

import org.openqa.selenium.WebDriver;

import Pages.DashboardPage;
import Pages.LoginPage;
import utils.BaseTest;

public class LoginLogoutUseCase extends BaseTest{

public static void main (String[] args) throws InterruptedException{
		WebDriver driver = getConfiguredDriver();		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.open();
		loginPage.fillEmailField();
		loginPage.fillPasswField();
		loginPage.clickSubmit();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnUserIcon();
		dp.clickOnExitIcon();
		
		closeDriver(driver);
	}
}
