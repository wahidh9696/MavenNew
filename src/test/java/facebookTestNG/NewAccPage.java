package facebookTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class NewAccPage extends Base{
	
	public NewAccPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobOrEmail;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement newPassword;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement custom;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement day;

	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getMobOrEmail() {
		return mobOrEmail;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getCustom() {
		return custom;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	
}
