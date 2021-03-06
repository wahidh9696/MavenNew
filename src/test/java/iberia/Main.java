package iberia;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.Base;

public class Main extends Base {
	
	@BeforeClass
	private void launch() {
		launchBrowser();
	}
	
	@Test
	private void test1() throws AWTException, InterruptedException {
		launchUrl("https://www.lot.com/in/en/");
		waitAll();
		
		HomePage p1=new HomePage();
		Robot r=new Robot();
		
		click(p1.getCookies());
		
		jsClick(driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")));
		jsSendKeys(p1.getOrigin(), "warsaw");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	//	jsClick(p1.getDest());
		jsSendKeys(p1.getDest(), "wroclaw");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		click(p1.getOneWay());
		
		click(p1.getPassenger());
		
		selectByVisibleText(p1.getAdults(), "2");
		
		jsClick(p1.getTicketClass());
	//	selectByVisibleText(p1.getTicketClass(), "LOT Business Class");
		
		
	}
	
	
	
	
	

}
