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
import pageobjects.CartOR;
import pageobjects.CheckoutOR;
import pageobjects.GlobalCartOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class Checkout extends GlobalUtil{
	public WebDriver driver;	
	public String firstName = "name12";
	public String lastName = "lName12";
	public String addressLine1 = "address21";
	public String city = "city11";
	public String zipCode = "35006";	
	public String phoneNumber = "2234567890";
	public String email = "asdf@gmail.com";	
	public String cardNumber = "4111111111111111";
	public String cardName = "automationCard";
	public String cardCVVNumber = "123";
	
	
	
	public Checkout() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, CheckoutOR.class);
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		PageFactory.initElements(driver, CartOR.class);		
		
	}
	
	
	@When("^I click on Checkout button$")
	public void i_click_on_Checkout_button() throws Throwable {
		clickOnElementUsingJS(driver, ProductDetailPageOR.checkOutButton);
	}
	
	@Given("^I continue as a Guest$")
	public void i_continue_as_a_Guest() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.checkoutAsGuestButton);
		clickOnElementUsingJS(driver, CheckoutOR.continueAsGuestButton);
	}

	@Then("^Login link is present there$")
	public void login_link_is_present_there() throws Throwable {    
		Assert.assertTrue("Checkout Login guest is not present" ,isWebElementPresent(driver, CheckoutOR.checkoutLogin));
	
	}
	
	@When("^I click on Next button in Ship To section with all fields empty$")
	public void i_click_on_Next_button_in_Ship_To_section_with_all_fields_empty() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNextButton);
	}
	
	@When("^I click on Sign in link$")
	public void i_click_on_Sign_in_link() throws Throwable {
		executionDelay(5000);
		clickOnElementUsingJS(driver, CheckoutOR.loginLink);
	}
	
	
	
	@When("^I enter all the mandatory fields of Ship to Section$")
	public void i_enter_all_the_mandatory_fields_of_Ship_to_Section() throws Throwable {
		executionDelay(4000);
		inputText(CheckoutOR.firstNameField, firstName, driver);
		inputText(CheckoutOR.lastNameField, lastName, driver);
		inputText(CheckoutOR.addressLine1, addressLine1, driver);
		inputText(CheckoutOR.cityField, city, driver);				
		SelectUsingIndex(CheckoutOR.checkoutProvinceDropDown, 1);
		executionDelay(5000);
		inputText(CheckoutOR.postalCode, zipCode, driver);	
		inputText(CheckoutOR.phoneNumber, phoneNumber, driver);
		
	}

	@When("^I click on Next$")
	public void i_click_on_Next() throws Throwable {
		clickOnElementUsingJS(driver, CheckoutOR.shipToNextButton);
		executionDelay(3000);
	}
	

	
	@Given("^I click on Ship method Next button$")
	public void i_click_on_Ship_method_Next_button() throws Throwable {
	    executionDelay(4000);
		clickOnElementUsingJS(driver, CheckoutOR.shipMethodNextButton);
	}

	
	
	@When("^I enter all the mandatory valid card information and click on Next button$")
	public void i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button() throws Throwable {
		inputText(CheckoutOR.creditCardNumber, cardNumber, driver);
		inputText(CheckoutOR.cardName, cardName, driver);
		SelectUsingIndex(CheckoutOR.cardExpiryMonth, 4);
		SelectUsingIndex(CheckoutOR.cardExpiryYear, 8);
		inputText(CheckoutOR.cardCVVNumber, cardCVVNumber, driver);
		//clickOnElementUsingJS(driver, CheckoutOR.paymentNextButton);	
	   
	}	
	
	@When("^I click on Billing Address Same as Shipping$")
	public void i_click_on_Billing_Address_Same_as_Shipping() throws Throwable {
		if(!CheckoutOR.sameBillingAddress.isSelected()) {
			clickOnElementUsingJS(driver, CheckoutOR.sameBillingAddress);
			executionDelay(3000);
		}
		
	}

	@Given("^I enter valid email id$")
	public void i_enter_valid_email_id() throws Throwable {
		inputText(CheckoutOR.billingEmailId, email, driver);
		clickOnElementUsingJS(driver, CheckoutOR.paymentNextButton);
	}	

	@When("^I click on Place order button$")
	public void i_click_on_Place_order_button() throws Throwable {		
		clickOnElementUsingJS(driver, CheckoutOR.placeOrderButton);
	}

	@Then("^Order gets placed successfully$")
	public void order_gets_placed_successfully() throws Throwable {		
		Assert.assertTrue("Order confirmation page is not displayed." ,isWebElementPresent(driver, CheckoutOR.orderConfirmationTitle));
		executionDelay(3000);
	}

	
}

	