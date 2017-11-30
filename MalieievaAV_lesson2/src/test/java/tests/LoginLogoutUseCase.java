package tests;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import Pages.DashboardPage;
import Pages.LoginPage;
import utils.BaseTest;

public class LoginLogoutUseCase extends BaseTest{

	private static EventFiringWebDriver driver;
	
	@BeforeClass
	public static void setup(){
		driver = getConfiguredDriver();
		Reporter.setEscapeHtml(false);
	}
	
//	@Test(dependsOnMethods = "test2")
	@Test
	public void UseCaseLoginLogout(){
				
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.open();
		loginPage.fillEmailField();
		loginPage.fillPasswField();
		loginPage.clickSubmit();
		
		DashboardPage dp = new DashboardPage(driver);
//		dp.clickOnUserIcon();
//		dp.clickOnExitIcon();
//		dp.clickLogoutButtonWithJS();
//		dp.scrollPageDown();
		dp.selectsubMenuItem();
	}	
	
	@AfterClass
	public void tearDown() {
		closeDriver(driver);
	}
	
	private void log(String message){
		Reporter.log(message + "<br>");
	}
}
