package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageClasses.HolidayHomes;
import PageClasses.HomePage;
import Utilities.BaseClass;

public class Test1 {
	
	@Test
	public void testone() {
		
		BaseClass baseClass = new BaseClass();
		
		baseClass.invokeBrowser("Chrome");
		HomePage homePage = baseClass.openURL();
		
		homePage.waitElementClickable("//span[text() = 'Holiday Homes']");
		homePage.clickHolidayHomeLink();
		homePage.hardwait();
		
		homePage.fillingCityName("Nairobi");
		homePage.hardwait();
		HolidayHomes holidayHomes = homePage.clickingCityName();
		
	    holidayHomes.waitElementClickable("//div[@class='cDAjs']/div/div[2]/span[text() = 'Tripadvisor Sort']");
	    holidayHomes.sortByTravellerRating();
	    
	    holidayHomes.hardwait();
	    holidayHomes.selectingLift();
	    
	    holidayHomes.hardwait();
		
	    holidayHomes.closeBrowser();
		
	}

}
