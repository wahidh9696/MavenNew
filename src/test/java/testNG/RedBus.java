package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.Base;

public class RedBus extends Base {
	
	@BeforeClass
	private void launch() {
		launchBrowser();
	}
	
	@AfterClass
	private void quit() {
		driver.quit();
	}
	
	@Test(dataProvider="travel")
	private void test1(String from, String to) throws InterruptedException {
		
		waitAll();
		launchUrl("https://www.redbus.in/");
	
		WebElement src = driver.findElement(By.id("src"));
		src.clear();
		src.sendKeys(from);
		driver.findElement(By.xpath("//li[@select-id='results[1]']")).click();
		driver.findElement(By.id("dest")).sendKeys(to);
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.id("onward_cal")).click();
		WebElement table = driver.findElement(By.id("rb-calendar_onward_cal"));
		table.findElement(By.xpath("(//td[@class='wd day'])[2]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
	}
	
	@DataProvider(name="travel")
	private Object[][] travel() {
		Object[][] obj=new Object[][] {
			{"chennai", "hyderabad"},
			{"chennai", "tuticorin"},
			{"chennai", "calicut"}
		};
		return obj;
	}
}

