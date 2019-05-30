package step_definitions;

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
import pageobjects.GlobalCartOR;
import pageobjects.ProductDetailPageOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class Cart extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	public String curentProduct;
	public String newProduct;
	public String itemName;
	public float itemTotal;
	//public String couponCode = "Testcoup1";
	public String invalidCouponCode = "asdewqs";
	public String invalidCouponCodeWithQuotes = "'asdewqs'";
	public String errorMessage = "Sorry, "+invalidCouponCodeWithQuotes+" does not appear to be a valid coupon code.";
	public String cartDiscountValue;
	
	
	
	public Cart() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, CartOR.class);
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		
	}
	
	@When("^I click on View cart button$")
	public void i_click_on_View_cart_button() throws Throwable {
	    clickOnElementUsingJS(driver, ProductDetailPageOR.viewCartButton);
	}

	@Then("^it navigates to basket page$")
	public void it_navigates_to_basket_page() throws Throwable {
		verifyWebsiteURL(driver, ConfigReader.getValue("basketPageURL"));
	}
	
	
	
	@Then("^Item / Quantity / Price / Item Total/Subtotal/Total fields are displaying in cart page$")
	public void item_Quantity_Price_Item_Total_Subtotal_Total_fields_are_displaying_in_cart_page() throws Throwable {
		Assert.assertTrue("Item code is not present" ,isWebElementPresent(driver, CartOR.cartItemCode));
		Assert.assertTrue("Item quantity is not present" ,isWebElementPresent(driver, CartOR.cartItemQuantity));
		Assert.assertTrue("Item price is not present" ,isWebElementPresent(driver, CartOR.cartItemPrice));
		Assert.assertTrue("Item Price total is not present" ,isWebElementPresent(driver, CartOR.cartItemPriceTotal));
		Assert.assertTrue("Item price sub total is not present" ,isWebElementPresent(driver, CartOR.cartSubTotal));
		Assert.assertTrue("Item image is not present" ,isWebElementPresent(driver, CartOR.cartOrderTotal));
	}
	

	

	







	
}
