package supermart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class HomePage extends Base{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='cookies-accept g-overflow o-btn o-btn-blue cookies-close g-no-padding g-no-margin']")
	private WebElement cookies;

	@FindBy(id="select2-departureAirport-container")
	private WebElement origin;

	@FindBy(id="select2-destinationAirport-container")
	private WebElement dest;

	@FindBy(xpath="(//label[@class='booker-label radio-label'])[1]")
	private WebElement roundTrip;
	
	@FindBy(xpath="(//label[@class='booker-label radio-label g-no-margin'])[1]")
	private WebElement oneWay;
	
	@FindBy(xpath="//span[@id='departureDate-display']")
	private WebElement deptDate;
	
	@FindBy(xpath="//span[@id='returnDate-display']")
	private WebElement returnDate;
	
	@FindBy(id="passenger-switch")
	private WebElement passenger;
	
	@FindBy(id="numOfAdults")
	private WebElement adults;
	
	@FindBy(id="numOfYouths")
	private WebElement youths;
	
	@FindBy(id="numOfChildren")
	private WebElement children;
	
	@FindBy(id="numOfInfants")
	private WebElement infants;
	
	@FindBy(id="ticketClass")
	private WebElement ticketClass;
	
	@FindBy(id="select2-ticketClass-result-cnfs-BUSINESS")
	private WebElement businessClass;
	
	@FindBy(id="(//span[text()='Search'])[2]")
	private WebElement btnSearch;

	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getBusinessClass() {
		return businessClass;
	}

	public WebElement getOrigin() {
		return origin;
	}

	public WebElement getDest() {
		return dest;
	}

	public WebElement getRoundTrip() {
		return roundTrip;
	}

	public WebElement getOneWay() {
		return oneWay;
	}

	public WebElement getDeptDate() {
		return deptDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getPassenger() {
		return passenger;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getYouths() {
		return youths;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getInfants() {
		return infants;
	}

	public WebElement getTicketClass() {
		return ticketClass;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	

}
