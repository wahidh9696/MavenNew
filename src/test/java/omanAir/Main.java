package omanAir;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.Base;

public class Main extends Base {
	
	@BeforeClass
	private void launch() {
		launchBrowser();
	}
	
	@Test
	private void test1() {
		launchUrl("https://www.omanair.com/in/en");
		waitAll();
		
		
		BookingPage p1=new BookingPage();
		
//		Select s=new Select(p1.getTripType());
//		s.selectByVisibleText("Return");
		
		selectByVisibleText(p1.getTripType(), "Return");
		selectByVisibleText(p1.getCabin(), "Economy");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
