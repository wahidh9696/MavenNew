package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.Base;

public class Facebook extends Base{

	public static void main(String[] args)  {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
			
//		WebElement newAcc = driver.findElement(By.id("u_0_2"));
//		click(newAcc);
//		
//		Thread.sleep(2000);
//		
//		WebElement month = driver.findElement(By.id("month"));
//		getOptions(month);
		
		WebElement para = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		String text = getText(para);
		System.out.println(text);
		
		
		
		
		
			
	}

}
