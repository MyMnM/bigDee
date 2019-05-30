package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GlobalCartOR {
	
	public final static String pdp_ItemName = "//h1[@itemprop='name']";
	public final static String golbalCart_item = "(//div[@id='global-cart']//a)[2]";	
	public final static String pdpQuantity = "//input[@id='mz_pdp_qty']";	
	public final static String globalCartQuantity = "(//div[@id='global-cart']//span)[1]";	
	public final static String globalCartPrice = "//span[@class='mz-item-rowtotal total-price ']";
	
	public final static String globalCartTotal = "//span[@class='subTotalMarginAmtCls']";	
	
	
	
	@FindBy(how=How.XPATH, using=pdp_ItemName)
	@CacheLookup
	public static WebElement pdp_ItemNameLabel;
	
	@FindBy(how=How.XPATH, using=golbalCart_item)
	
	public static WebElement golbalCart_itemName;	
	
	
	@FindBy(how=How.XPATH, using=pdpQuantity)
	public static WebElement pdpQuantityValue;	
	
	@FindBy(how=How.XPATH, using=globalCartQuantity)	
	public static WebElement globalCartQuantityValue;
	
	@FindBy(how=How.XPATH, using=globalCartPrice)
	@CacheLookup
	public static WebElement globalCartPriceValue;
	
	@FindBy(how=How.XPATH, using=globalCartTotal)	
	public static WebElement globalCartTotalValue;
	
	

}
