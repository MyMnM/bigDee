package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPageOR {
	
	
	public final static String addToCart = "//button[@id='add-to-cart']";	
	public final static String recentlyViewed = "//h3[contains(text(),'Recently Viewed Items')]";
	public final static String youMayAlsoLike = "//h3[contains(text(),'You May Also Like')]";
	public final static String pdpItemName = "//h1[@class='mz-pagetitle']";
	public final static String viewCart = "//a[contains(text(),'View Cart')]";
	public final static String checkOut = "//button[contains(text(),'Checkout ')]";
	
	
	@FindBy(how=How.XPATH, using=addToCart)	
	public static WebElement addToCartButton;	
	
	@FindBy(how=How.XPATH, using=pdpItemName)
	@CacheLookup
	public static WebElement itemName;
	
	@FindBy(how=How.XPATH, using=recentlyViewed)
	@CacheLookup
	public static WebElement recentlyViewedItems;
	
	@FindBy(how=How.XPATH, using=youMayAlsoLike)
	@CacheLookup
	public static WebElement youMayAlsoLikeSection;
	
	@FindBy(how=How.XPATH, using=viewCart)
	@CacheLookup
	public static WebElement viewCartButton;
	
	
	@FindBy(how=How.XPATH, using=checkOut)
	@CacheLookup
	public static WebElement checkOutButton;
	
	

}
