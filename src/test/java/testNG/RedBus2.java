package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.Base;

public class RedBus2 extends Base {
	
	@BeforeClass
	private void launch() {
		launchBrowser();
	}
	
//	@AfterClass
//	private void quit() {
//		driver.quit();
//	}
	
	@Test
	private void test1() throws InterruptedException {
		
		waitAll();
		launchUrl("https://www.redbus.in/");
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(1);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement mobNo = driver.findElement(By.id("mobileNoInp"));
		js.executeScript("arguments[0].setAttribute('value', '7305561567')", mobNo);
		Assert.assertEquals(mobNo.getAttribute("value"), "7305561567", "Verify Mobile Number");
	//	driver.switchTo().defaultContent();
	//	driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		
	}
}

