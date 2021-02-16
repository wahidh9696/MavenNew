package jUnit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	static WebDriver driver;
	public Date d=new Date();
	
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Before
	public void startTime() {	
		System.out.println("Start time: "+d);
	}
	
	@Test
	public void Test1() {
		 driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("Water Heater");
		 driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	}
		
	@Test
	public void Test2() {
		driver.findElement(By.xpath("//label[@for='Type_s-Storage Geyser']")).click();
	}
	
	@Test
	public void Test3() {
		driver.findElement(By.xpath("(//p[@class='product-title'])[2]")).click();
	}
	
	@After
	public void endTime() {	
		System.out.println("End Time: "+d);
	}
	
	@AfterClass
	public static void closeWindow() {
		driver.close();
	}

}
