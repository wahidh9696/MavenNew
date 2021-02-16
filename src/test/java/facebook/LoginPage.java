package facebook;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.Base;


public class LoginPage extends Base{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	@FindBy(xpath="//a[@id='u_0_2']")
	private WebElement btnCreateNewAcc;
	
	public WebElement getBtnCreateNewAcc() {
		return btnCreateNewAcc;
	}

	public void login() throws IOException {
		sendKeys(getUserName(), excelData(1, 0));
		sendKeys(getPassword(), excelData(1, 3));
		click(getBtnLogin());
	}
	
	
	public void createNewAcc() {
		click(getBtnCreateNewAcc());
	}
	
	
	
}
