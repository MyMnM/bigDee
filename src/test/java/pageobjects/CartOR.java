package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartOR {
	
	public final static String cartItemImage = "//img[@class='mz-carttable-item-image']";
	public final static String cartItem = "//a[@class='mz-carttable-item-title']";
	public final static String cartItemQuantity = "//input[@class='mz-carttable-qty-field text-center']";
	public final static String cartItemPrice = "//div[@class='mz-carttable-item-price col-xs-12 col-sm-6 col-md-4 mz mz-reset-padding mz-total-price']";
	public final static String cartItemPriceTotal = "//div[@class='mz-carttable-item-total col-xs-12 col-sm-6 col-md-4 mz mz-reset-padding nopaddingright mz-each-price']";
	public final static String cartItemCode = "//span[@class='mz-carttable-item-code']";
	public final static String cartSubTotal = "(//div[@id='mz-carttable-total'])[1]";
	public final static String cartOrderTotal = "(//div[@id='mz-carttable-total'])[4]";	

	@FindBy(how=How.XPATH, using=cartItemImage)	
	public static WebElement itemImage;
	
	@FindBy(how=How.XPATH, using=cartItem)
	@CacheLookup
	public static WebElement Item;
	
	@FindBy(how=How.XPATH, using=cartItemQuantity)
	@CacheLookup
	public static WebElement quantity;
	
	@FindBy(how=How.XPATH, using=cartItemPrice)
	@CacheLookup
	public static WebElement price;
	
	@FindBy(how=How.XPATH, using=cartItemPriceTotal)	
	public static WebElement priceTotal;
	
	@FindBy(how=How.XPATH, using=cartItemCode)
	@CacheLookup
	public static WebElement itemCode;
	
	@FindBy(how=How.XPATH, using=cartSubTotal)
	@CacheLookup
	public static WebElement subTotal;
	
	@FindBy(how=How.XPATH, using=cartOrderTotal)
	@CacheLookup
	public static WebElement totalPrice;
	
}
