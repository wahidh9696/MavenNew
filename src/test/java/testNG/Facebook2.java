package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.Base;

public class Facebook2 extends Base{
	
	@BeforeClass
	private void browserLaunch() {
		launchBrowser();
		waitAll();
	}
	
	@AfterClass
	private void quitBrowser() {
		driver.quit();
	}
	
	@Test
	private void test1() throws InterruptedException  {
		launchUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		sendKeys(userName, "abdul");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Test 1");
		Thread.sleep(3000);
	}
	
	@Test
	private void test6() throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("wahidh");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Test 6");
		Thread.sleep(3000);
	}
	
	@Test
	private void test4() throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("vappa");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Test 4");
		Thread.sleep(3000);
	}
}
