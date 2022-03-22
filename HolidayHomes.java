package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.BaseClass;

public class HolidayHomes extends BaseClass{
	
	public HolidayHomes(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[@class='cDAjs']/div/div[2]/span[text() = 'Tripadvisor Sort']")
	public WebElement tripAdvisorSort;
	
	@FindBy(xpath = "//span[text() = 'Traveller Rating']")
	public WebElement travellerRating;
	
	//Sorting by traveller rating
	public void sortByTravellerRating() {
		tripAdvisorSort.click();
		travellerRating.click();		
	}
	
	@FindBy(xpath = "//div[normalize-space(text()) = 'Check-in']")
	public WebElement checkITextBox;
	
	//Filling the check-in date.
	public void fillCheckInDate() {
		
	}
	
	@FindBy(xpath = "//div[normalize-space(text()) = 'Check-out']")
	public WebElement checkOutTextBox;
	
	//Filling the check-out date.
	public void fillCheckOutDate() {
			
	}
	
	@FindBy(xpath = "//div[normalize-space(text()) = 'Guests']")
	public WebElement guestsTextBox;
	
	@FindBy(xpath = "//div[contains(text() , 'Bedrooms')]/..//span[contains(@class, 'plus')]")
	public WebElement addBedrooms;
	
	@FindBy(xpath = "//div[contains(text() , 'guests')]/..//span[contains(@class, 'plus')]")
	public WebElement addGuests;
	
	@FindBy(xpath = "//div[contains(text() , 'Bath')]/..//span[contains(@class, 'plus')]")
	public WebElement addBathrooms;
	
	@FindBy(xpath = "//button[contains(text() , 'Apply')]")
	public WebElement applyButton;
	
	//
	
	@FindBy(xpath = "//div[text() = 'Amenities']/..//span[text() = 'Show more']")
	public WebElement amenitiesShowMoreButton;
	
	@FindBy(xpath = "//label[@class = 'label']//div[contains(text() , 'Lift')]")
	public WebElement selectLift;
	
	//Selecting the LiftCheckBox
	public void selectingLift() {
		amenitiesShowMoreButton.click();
		selectLift.click();
	}
	
	
}
