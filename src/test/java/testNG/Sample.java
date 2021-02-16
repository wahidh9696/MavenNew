package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.Base;

public class Sample extends Base {
	
	@BeforeClass
	private void browserLaunch() {
		launchBrowser();
		waitAll();
	}
	
	@Test()
	private void test1() {
		launchUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("wahidh");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		
		Assert.assertEquals(userName.getAttribute("value"), "wahidh", "Verify userName");
		Assert.assertEquals(password.getAttribute("value"), "12345", "Verify password");
	}
	
	@Test
	private void test2() {
		System.out.println("Hello Wahidh......");
	}
}
