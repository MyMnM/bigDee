package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.PageFactory;

import UIAction.GlobalCartAction;
import UIAction.ProductListAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.GlobalCartOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class GlobalCart extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	String curentProduct;
	String newProduct;
	String itemName;
	
	
	public GlobalCart() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, GlobalCartOR.class);
		PageFactory.initElements(driver, homePageOR.class);
	}
	
	
	@Then("^badge counter should reflect the number of items in cart$")
	public void badge_counter_should_reflect_the_number_of_items_in_cart() throws Throwable {
		executionDelay(4000);
		String quantity = GlobalCartOR.pdpQuantityValue.getAttribute("value");
		//System.out.println("quantity "+quantity);
		executionDelay(4000);
		hoverMouse(homePageOR.cartIcon, driver);
		//System.out.println("quantity2 "+GlobalCartOR.globalCartQuantityValue.getText());
		Assert.assertEquals("Quantity is not same in global cart as in PDP page", quantity , GlobalCartOR.globalCartQuantityValue.getText());
	   
	}
	@Then("^price should be total price of all the items in cart$")
	public void price_should_be_total_price_of_all_the_items_in_cart() throws Throwable {
		// add one more quantity to global cart
		navigateToURL(ConfigReader.getValue("PDPURL2"), driver);
		clickOnElementUsingJS(driver, ProductDetailPageOR.addToCartButton);
		executionDelay(5000);
		//added one more item
		navigateToURL(ConfigReader.getValue("PDPURL3"), driver);
		clickOnElementUsingJS(driver, ProductDetailPageOR.addToCartButton);
		
		GlobalCartAction.validatePrice(driver);
	}

	

	
}
