package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import UIAction.ProductListAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ConfigReader;
import helpers.GlobalUtil;

import pageobjects.homePageOR;
import pageobjects.productListOR;

public class productList extends GlobalUtil{
	public WebDriver driver;	
	public boolean result;
	public String filterValue;	
	String curentProduct;
	String newProduct;
	public String usSiteFirstElement;
	public String usSiteSecondElement;
	
	
	
	public productList() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
	}
	
	@When("^I navigate to product List page$")
	public void i_navigate_to_product_List_page() throws Throwable {
		PageFactory.initElements(driver, productListOR.class);
		navigateToURL(ConfigReader.getValue("productListURL"), driver);
	}	
	
	
	@When("^I select A to Z sortby value$")
	public void i_select_A_to_Z_sortby_value() throws Throwable {
		executionDelay(4000);
		SelectUsingIndex(productListOR.sortByDropDown, 5);
		executionDelay(15000);
	}

	@Then("^products gets listed as per A to Z$")
	public void products_gets_listed_as_per_A_to_Z() throws Throwable {
		Assert.assertTrue("it is not sorted as per A to Z", productListOR.productNameLink.getText().startsWith("A"));
	}

	@When("^I select Z to A sortby value$")
	public void i_select_Z_to_A_sortby_value() throws Throwable {
	    SelectUsingIndex(productListOR.sortByDropDown, 6);
	    executionDelay(10000);
	}

	@Then("^products gets listed as per Z to A$")
	public void products_gets_listed_as_per_Z_to_A() throws Throwable {
		Assert.assertTrue("it is not sorted as per A to Z", productListOR.productNameLink.getText().startsWith("Z"));	
	}
	
	/*@When("^I hover the mouse over the product$")
	public void i_hover_the_mouse_over_the_product() throws Throwable {
	    hoverMouse(productListOR.productImageLink, driver);
	}

	@Then("^it displays Quick view button$")
	public void it_displays_Quick_view_button() throws Throwable {
		Assert.assertTrue("Quick view is not coming", isWebElementPresent(driver, productListOR.quickShop));
	}*/
	
	@When("^I hover the mouse over the product$")
	public void i_hover_the_mouse_over_the_product() throws Throwable {
	    ProductListAction.isQuickViewDisplayed(driver);
	}
	@Then("^it displays Quick view button$")
	public void it_displays_Quick_view_button() throws Throwable {
		executionDelay(5000);
	}

	
	
}