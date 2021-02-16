package website;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class PricePage extends Base {
	
	public PricePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-qa='product-name']")
	private List<WebElement> name;
	
	@FindBy(xpath="//div[@class='sc-3751lm-1 eUJkVt large']")
	private List<WebElement> price;

	public List<WebElement> getName() {
		return name;
	}

	public List<WebElement> getPrice() {
		return price;
	}
	
	
	
	

}
