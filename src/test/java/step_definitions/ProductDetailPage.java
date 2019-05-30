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
import pageobjects.GlobalCartOR;
import pageobjects.ProductDetailPageOR;

public class ProductDetailPage extends GlobalUtil{
	public WebDriver driver;		
	public String categoryName;
	
	
	public ProductDetailPage() {
		driver = Hooks.driver;
		//driver = HomePageRunnerTest.driver;
		PageFactory.initElements(driver, ProductDetailPageOR.class);
		PageFactory.initElements(driver, GlobalCartOR.class);
	}
	
	@When("^I navigate to Product Detail Page$")
	public void i_navigate_to_Product_Detail_Page() throws Throwable {		
		navigateToURL(ConfigReader.getValue("PDPURL"), driver);
	}
	
	@When("^I click on Add to Cart button$")
	public void i_click_on_Add_to_Cart_button() throws Throwable {
		//String pdpItemName = ProductDetailPageOR.itemName.getText();
		clickOnElementUsingJS(driver, ProductDetailPageOR.addToCartButton);
	}

	@Then("^the product gets added to cart$")
	public void the_product_gets_added_to_cart() throws Throwable {
		executionDelay(4000);
		String pdpItemName = ProductDetailPageOR.itemName.getText();
		//System.out.println("item name "+pdpItemName);
		//System.out.println("item name2 "+ GlobalCartOR.golbalCart_itemName.getText());
		Assert.assertEquals("Item is not added to the cart", pdpItemName, GlobalCartOR.golbalCart_itemName.getText());
	}
	
	@Then("^Recently view Item section is visible$")
	public void recently_view_Item_section_is_visible() throws Throwable {
		navigateToURL(ConfigReader.getValue("PDPURL2"), driver);//this is added because Recently viewed is visible when we search more than 1 item
		scrollIntoView(ProductDetailPageOR.recentlyViewedItems, driver);
		Assert.assertTrue("Recently viewed is not visible", isWebElementPresent(driver, ProductDetailPageOR.recentlyViewed));
		
	}

	@Then("^You May also like section is visible$")
	public void you_May_also_like_section_is_visible() throws Throwable {
		scrollIntoView(ProductDetailPageOR.youMayAlsoLikeSection, driver);
		Assert.assertTrue("You may also like is not visible", isWebElementPresent(driver, ProductDetailPageOR.youMayAlsoLike));
		
	}
	
	



	
}
