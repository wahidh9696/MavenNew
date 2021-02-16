package facebookTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class LoginPage extends Base{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="u_0_2")
	private WebElement newAccBtn;

	public WebElement getNewAccBtn() {
		return newAccBtn;
	}
	
	
	
	

}
