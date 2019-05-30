package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;

import pageobjects.homePageOR;

public class homePage extends GlobalUtil{
	public WebDriver driver;
	public String month = "09";
	public String day = "09";
	public String year = "1991";
	public static String wrongFormatEmailId = "wrongvalue@123";
	public static String wrongEmailId = "64aaaa@gmail.com";
	
	
	public homePage() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, homePageOR.class);
	}
	
	@Given("^I open the given website$")
	public void i_open_the_given_website() throws Throwable {		
		driver.get(ConfigReader.getValue("HomePageURL"));	
		executionDelay(5000);
		
	}

	@Then("^verify the Url$")
	public void verify_the_Url() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("HomePageURL"));
	}

	@When("^I click on logo of the website$")
	public void i_click_on_logo_of_the_website() throws Throwable {
		executionDelay(5000);
		highlight(homePageOR.homePageLogo, driver);
		clickOnElementUsingJS(driver, homePageOR.homePageLogo);
	}

	@Then("^it redirects me to the Home Page$")
	public void it_redirects_me_to_the_Home_Page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("HomePageURL"));
	    
	}
	
	@When("^I enter the value \"([^\"]*)\"in Search bar$")
	public void i_enter_the_value_in_Search_bar(String searchTerm) throws Throwable {
	    //executionDelay(5000);
		//highlight(homePageOR.searchBox, driver);
		inputText(homePageOR.searchBox, searchTerm,driver);
		executionDelay(5000);
	}

	@Then("^give auto suggestions for what user types$")
	public void give_auto_suggestions_for_what_user_types() throws Throwable {
		//highlight(homePageOR.searchTermResults, driver);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.searchResults), "Search results is not coming");		
		executionDelay(5000);
	}	
	
	@When("^I click on Login icon$")
	public void i_click_on_Login_icon() throws Throwable {
	   // executionDelay(5000);
		clickOnElementUsingJS(driver, homePageOR.loginIcon);
	   
	}

	@Then("^it opens new Shopper Window$")
	public void it_opens_new_Shopper_Window() throws Throwable {
		//executionDelay(5000);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.newShopper), "New shopper window is not coming");
		
	}
	
	@When("^I hover on the cart icon$")
	public void i_hover_on_the_cart_icon() throws Throwable {
		//executionDelay(5000);
	    hoverMouse(homePageOR.cartIcon,driver);
	}

	@Then("^it shows the cart contents$")
	public void it_shows_the_cart_contents() throws Throwable {
		executionDelay(5000);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.cartContent), "cart content is not coming");
		
	}	
	
	
	@When("^I click on Supplements menu$")
	public void i_click_on_Supplements_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.supplementsMenu);
	}

	@Then("^it redirects to Supplements page$")
	public void it_redirects_to_Supplements_page() throws Throwable {
		
		verifyWebsiteURL(driver, ConfigReader.getValue("supplementsURL"));
	}

	@When("^I click on horse care menu$")
	public void i_click_on_horse_care_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.horseCareMenu);
	}

	@Then("^it redirects to horse care page$")
	public void it_redirects_to_horse_care_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("horseCareURL"));
	}

	@When("^I click on leg protection menu$")
	public void i_click_on_leg_protection_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.legProtectionMenu);
	}

	@Then("^it redirects to leg protection page$")
	public void it_redirects_to_leg_protection_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("legProtectionURL"));
	}

	@When("^I click on horse wear menu$")
	public void i_click_on_horse_wear_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.horseWearMenu);
	}

	@Then("^it redirects to horse wear page$")
	public void it_redirects_to_horse_wear_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("horseWearURL"));
	}

	@When("^I click on track and equipment menu$")
	public void i_click_on_track_and_equipment_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.trackAndEquipmentMenu);
	}

	@Then("^it redirects to track and equipment page$")
	public void it_redirects_to_track_and_equipment_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("trackAndEquipmentURL"));
	}

	@When("^I click on farm and barn menu$")
	public void i_click_on_farm_and_barn_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.farmAndBarntMenu);
	}

	@Then("^it redirects to farm and barn page$")
	public void it_redirects_to_farm_and_barn_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("farmAndBarnURL"));
	}

	@When("^I click on apparel and gift menu$")
	public void i_click_on_apparel_and_gift_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.apparelAndGiftMenu);
	}

	@Then("^it redirects to apparel and gift page$")
	public void it_redirects_to_apparel_and_gift_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("apparelAndGiftURL"));
	}

	@When("^I click on pet supplies menu$")
	public void i_click_on_pet_supplies_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.petSuppliesMenu);
	}

	@Then("^it redirects to pet supplies page$")
	public void it_redirects_to_pet_supplies_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("petSuppliesURL"));
	}

	@When("^I click on sale menu$")
	public void i_click_on_sale_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.onSaleMenu);
	}

	@Then("^it redirects to on sale page$")
	public void it_redirects_to_on_sale_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("onSaleURL"));
	}

	@When("^I click on shop by brand menu$")
	public void i_click_on_shop_by_brand_menu() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.shopByBrandMenu);
	}

	@Then("^it redirects to shop by brand page$")
	public void it_redirects_to_shop_by_brand_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("shopByBrandURL"));
	}	
	

	
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String username, String password) throws Throwable {
	   //executionDelay(5000);
	   inputText(homePageOR.login_username, username,driver);
	   inputText(homePageOR.login_password, password,driver);
	   
	   
	}

	@When("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {		
		clickOnElementUsingJS(driver, homePageOR.loginButton);
		executionDelay(7000);
	}

	@Then("^I am successfully logged in$")
	public void i_am_successfully_logged_in() throws Throwable {			
		clickOnElementUsingJS(driver, homePageOR.myAccountField);		
		isWebElementPresent(driver,homePageOR.logOut);
		//executionDelay(5000);
	}
	
	

	@When("^I enter username as \"([^\"]*)\" password as \"([^\"]*)\" and Re-enter password as \"([^\"]*)\"$")
	public void i_enter_username_as_password_as_and_Re_enter_password_as(String username, String password, String reEnterPassword) throws Throwable {
	    String new_username = generateRandomNumber()+username;
	    System.out.println("username is"+new_username );
		inputText(homePageOR.signUpEmailBox, new_username,driver);
	    inputText(homePageOR.signUpPasswordBox, password,driver);
	    inputText(homePageOR.signUpReEnterPasswordBox, reEnterPassword,driver);
	}
	
	

	
    

	

	
	@When("^I click on logout$")
	public void i_click_on_logout() throws Throwable {
		//executionDelay(5000);
		clickOnElementUsingJS(driver, homePageOR.myAccountField);
		//executionDelay(5000);
		clickOnElementUsingJS(driver, homePageOR.logOutLink);
		//executionDelay(7000);
		
	}

	@Then("^it logged out successfully$")
	public void it_logged_out_successfully() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.loginIcon);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.newShopper), "New Shopper is not present.So it does not log out");		
		//executionDelay(5000);
	}
	
	
	
	@Given("^I click on New shooper link$")
	public void i_click_on_New_shooper_link() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.newShopperWindow);
	}

	@Given("^I enter username as \"([^\"]*)\" password as \"([^\"]*)\" re-enter password as \"([^\"]*)\" security answer as \"([^\"]*)\"$")
	public void i_enter_username_as_password_as_re_enter_password_as_security_answer_as(String username, String password, String reEnterPassword, String securityAnswer) throws Throwable {
		String new_username = generateRandomNumber()+username;
	    System.out.println("username is"+new_username );
		inputText(homePageOR.signUpEmailBox, new_username,driver);
	    inputText(homePageOR.signUpPasswordBox, password,driver);
	    inputText(homePageOR.signUpReEnterPasswordBox, reEnterPassword,driver);
	    SelectUsingIndex(homePageOR.securityQuestionDropDown, 1);
	    inputText(homePageOR.securityAnswerField, securityAnswer,driver);
	}

	@When("^I click on Register button$")
	public void i_click_on_Register_button() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.registerButton);
	}

	@Then("^it is sign up successfully$")
	public void it_is_sign_up_successfully() throws Throwable {
		clickOnElementUsingJS(driver, homePageOR.myAccountField);
		executionDelay(5000);
		Assert.assertTrue(isWebElementPresent(driver, homePageOR.logOut), "Log out button is not present");
	    
	}




}
