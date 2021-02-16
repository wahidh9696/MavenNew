package omanAir;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.Base;

public class BookingPage extends Base{
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ways_desktop")
	private WebElement tripType;

	@FindBy(xpath="//p[@class='dLabel cursor-pointer']")
	private WebElement passenger;

	@FindBy(id="flight-clases_desktop")
	private WebElement cabin;

	@FindBy(id="Cash-Miles_desktop")
	private WebElement cashType;
	
	@FindBy(xpath="(//div[@class='widget-bottom-div input-div input-1 tabindex_div'])[1]")
	private WebElement from;
	
	@FindBy(xpath="(//div[@class='widget-bottom-div input-div input-2 tabindex_div'])[1]")
	private WebElement to;
	
	@FindBy(xpath="(//input[@class='form-control input-1'])[1]")
	private WebElement departDate;
	
	@FindBy(xpath="(//input[@class='form-control input-1'])[2]")
	private WebElement returnDate;
	
	@FindBy(xpath="//div[@class='flight-button Find_Flights']")
	private WebElement findFlights;
	
	
	
	public WebElement getPassenger() {
		return passenger;
	}



	public WebElement getCabin() {
		return cabin;
	}



	public WebElement getCashType() {
		return cashType;
	}



	public WebElement getFrom() {
		return from;
	}



	public WebElement getTo() {
		return to;
	}



	public WebElement getDepartDate() {
		return departDate;
	}



	public WebElement getReturnDate() {
		return returnDate;
	}



	public WebElement getFindFlights() {
		return findFlights;
	}



	public WebElement getTripType() {
		return tripType;
	}
	
	
	
	
	

}
