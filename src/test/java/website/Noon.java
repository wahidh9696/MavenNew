package website;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Noon extends Pom {
	
	@BeforeClass
	private void browserLaunch() {
		launchBrowser();
	}
	
	@Test
	private void test1() throws AWTException, InterruptedException {
		launchUrl("https://www.noon.com/uae-en");
		waitAll();
		
		Pom p=new Pom();
		
		sendKeys(p.getSearch(), "laptop");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		p.getMin().clear();
		sendKeys(p.getMin(), "2000");
		
		p.getMax().clear();
		sendKeys(p.getMax(), "2100");
		
		click(p.getGoButton());
		
		PricePage pp=new PricePage();
		
		for (int i = 0; i < pp.getName().size(); i++) {
			getText(pp.getName().get(i));
		}
		
		int num=0;
		String aed=null;
		List<Integer> li=new ArrayList<Integer>();
		
		for (int i = 0; i < pp.getPrice().size(); i++) {
			String text = getText1(pp.getPrice().get(i));
				String cost = text.substring(4,8);
				 aed = text.substring(0, 3);
				
			int number = Integer.parseInt(cost);
			li.add(number);
		
		Collections.sort(li);
		
		for (int j = 0; j < li.size(); j++) {
			 num = li.get(i);
			}
		System.out.println(aed+" "+num);
		}
		
	}
		
@AfterClass
private void browserClose() {
	driver.quit();
}
		
}
