package website;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends PricePage{
	
	public Pom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="searchBar")
	private WebElement search;

	@FindBy(xpath="(//input[@class='textInput'])[1]")
	private WebElement min;
	
	@FindBy(xpath="(//input[@class='textInput'])[2]")
	private WebElement max;
	
	@FindBy(xpath="(//button[@class='between'])[1]")
	private WebElement goButton;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getMin() {
		return min;
	}

	public WebElement getMax() {
		return max;
	}

	public WebElement getGoButton() {
		return goButton;
	}


}
