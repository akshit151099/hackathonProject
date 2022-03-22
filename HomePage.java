package PageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage extends BaseClass{
	
	// This is constructor which take instance of global driver and pass it to local driver.
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@FindBy(xpath = "//span[text() = 'Holiday Homes']")
	public WebElement HolidayHomeLink;
	
	public void clickHolidayHomeLink() {
		HolidayHomeLink.click();
	}
	
	@FindBy(xpath = "//div[@class='hrjYF']//input[1]")
	public WebElement cityTextBox;
	
	@FindBy(xpath = "//div[@id='typeahead_results']/a[1]")
	public WebElement cityname;
	
	public void fillingCityName(String city) {
		cityTextBox.sendKeys(city);
	}
	
	public HolidayHomes clickingCityName() {
		cityname.click();
		return PageFactory.initElements(driver, HolidayHomes.class);
	}
}
