package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageClasses.HomePage;


public class BaseClass {
	
	public WebDriver driver;
	/***********************Invoking the Browser*************************/
	public void invokeBrowser(String browserName) {
		
		try {
			if(browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\2111569\\eclipse-workspace\\FirstSelenium Project\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			
			else if(browserName.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\2111569\\eclipse-workspace\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	/***********************Opening the Website*************************/
	public HomePage openURL() {
		driver.get("https://www.tripadvisor.in/");
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	public void waitElementClickable(String elementXpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
	}
	
	public void hardwait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/***********************Getting the page title*************************/
	public void getPageTitle(String expectedValue) {
		Assert.assertEquals(driver.getTitle(), expectedValue);
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}

