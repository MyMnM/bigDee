package step_definitions;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.PageFactory;

import UIAction.ProductListAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;

import pageobjects.MyAccountOR;

import pageobjects.homePageOR;


public class MyAccount extends GlobalUtil{
	public WebDriver driver;
	public String wrongFormatEmail = "wrong";
	public String firstName;
	public String lastName;
	public String email;
	public String productName;
	
	public String addressFirstName = "name12";
	public String addressLastName = "lName12";
	public String addressLine1 = "address21";
	public String city = "city11";
	public String zipCode = "wc1n3ax";
	public String phoneNumber = "2234567890";
	
	public String newPassword;
	public String userName;
	
	public MyAccount() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, MyAccountOR.class);		
		PageFactory.initElements(driver, homePageOR.class);
		
		
		
	}	
	
	@Given("^click on My Information$")
	public void click_on_My_Information() throws Throwable {
		executionDelay(6000);
		clickOnElementUsingJS(driver, MyAccountOR.myInformationLLink);
		
	}

	@Then("^it navigates to my account page$")
	public void it_navigates_to_my_account_page() throws Throwable {
		executionDelay(4000);
		verifyWebsiteURL(driver, ConfigReader.getValue("myAccountSettingsURL"));
	}
	
	
}
