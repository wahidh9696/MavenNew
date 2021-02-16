package facebookTestNG;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Main extends LoginPage {
	
	@BeforeClass
	private void browserLaunch() {
		launchBrowser();
		
	}
	
//	@AfterClass
//	private void quitBrowser() {
//		driver.quit();
//	}
	
	@Test(dataProvider="New Account")
	private void datas(String fname, String sname, String mobno, String pass, String gender) throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		waitAll();
		LoginPage p1=new LoginPage();
		click(p1.getNewAccBtn());
		Thread.sleep(3000);
		NewAccPage p2=new NewAccPage();
		sendKeys(p2.getFirstName(), fname);
		sendKeys(p2.getSurName(), sname);
		sendKeys(p2.getMobOrEmail(), mobno);
		sendKeys(p2.getNewPassword(), pass);
		
		if (gender.equalsIgnoreCase("male")) {
			click(p2.getMale());
		}else{
			if (gender.equalsIgnoreCase("female")) {
			click(p2.getFemale());
		} else {
			click(p2.getCustom());
			}
		}
	}
	
	
	@DataProvider(name="New Account")
	public static Object[][] signUp() throws IOException {
		Object[][] ob=excelDataProvider();
		return ob;
	}
}
