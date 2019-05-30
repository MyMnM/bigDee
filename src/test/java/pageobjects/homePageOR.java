package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePageOR {
	public final static String logo="//img[@src='/resources/images/logoBigDee.png']";	
	public final static String searchBar="//input[@placeholder='Search or item #']";
	public final static String searchResults="//span[@class='tt-dropdown-menu']";	
	public final static String login="//a[@class='login-link-text']";
	public final static String newShopper="//a[contains(text(),'New Shopper')]";
	public final static String cart="//div[@class='ml-icon ml-icon-global-cart']";
	public final static String cartContent = "//div[@id='global-cart']";	
	public final static String myAccountIcon = "//a[@id='my-account']";
	
	public final static String supplements = "//a[@href='/horse-supplements/c/683']";
	public final static String horseCare = "//a[@href='/horse-care/c/32']";
	public final static String legProtection = "//a[@href='/leg-protection/c/461']";
	public final static String horseWear = "//a[@href='/horse-wear/c/29']";
	public final static String trackAndEquipment = "//a[@href='/tack-n-equipment/c/726']";
	public final static String farmAndBarn = "//a[@href='/farm-n-barn/c/591']";
	public final static String apparelAndGift = "//a[@href='/apparel-n-gift/c/317']";
	public final static String petSupplies = "//a[@href='/pet-supplies/c/275']";
	public final static String onSale = "//a[@href='/on-sale/c/401']";
	public final static String shopByBrand = "//a[@href='/shop-by-brand/c/14']";	
	public final static String username = "(//input[@type='email'])[1]";
	public final static String password = "(//input[@type='password'])[1]";
	public final static String logIn = "//button[contains(text(),'LogIn')]";	
	public final static String logOut = "(//a[@href='/logout'])[1]";		
	public final static String signUpEmail = "(//input[@type='email'])[2]";
	public final static String signUpPassword = "(//input[@type='password'])[2]";
	public final static String signUpReEnterPassword = "(//input[@type='password'])[3]";
	public final static String securityQuestion = "//select[@id='recoveryQuestionList']";
	public final static String securityAnswer = "//input[@id='recoveryAnswer']";
	public final static String register = "//button[contains(text(),'Register')]";	
		
	
	@FindBy(how=How.XPATH, using=logo)
	@CacheLookup
	public static WebElement homePageLogo;	
	
	
	@FindBy(how=How.XPATH, using=searchBar)
	@CacheLookup
	public static WebElement searchBox;
	
	@FindBy(how=How.XPATH, using=searchResults)
	@CacheLookup
	public static WebElement searchTermResults;
	
	
	@FindBy(how=How.XPATH, using=login)	
	public static WebElement loginIcon;
	
	@FindBy(how=How.XPATH, using=newShopper)
	@CacheLookup
	public static WebElement newShopperWindow;
	
	@FindBy(how=How.XPATH, using=cart)	
	public static WebElement cartIcon;
	
	@FindBy(how=How.XPATH, using=cartContent)
	@CacheLookup
	public static WebElement globalCartMenu;
	
	@FindBy(how=How.XPATH, using=supplements)
	@CacheLookup
	public static WebElement supplementsMenu;
	
	@FindBy(how=How.XPATH, using=horseCare)
	@CacheLookup
	public static WebElement horseCareMenu;
	
	@FindBy(how=How.XPATH, using=legProtection)
	@CacheLookup
	public static WebElement legProtectionMenu;
	
	@FindBy(how=How.XPATH, using=horseWear)
	@CacheLookup
	public static WebElement horseWearMenu;
	
	@FindBy(how=How.XPATH, using=trackAndEquipment)
	@CacheLookup
	public static WebElement trackAndEquipmentMenu;
	
	@FindBy(how=How.XPATH, using=farmAndBarn)
	@CacheLookup
	public static WebElement farmAndBarntMenu;
	
	@FindBy(how=How.XPATH, using=apparelAndGift)
	@CacheLookup
	public static WebElement apparelAndGiftMenu;
	
	@FindBy(how=How.XPATH, using=petSupplies)
	@CacheLookup
	public static WebElement petSuppliesMenu;
	
	@FindBy(how=How.XPATH, using=onSale)
	@CacheLookup
	public static WebElement onSaleMenu;
	
	@FindBy(how=How.XPATH, using=shopByBrand)
	@CacheLookup
	public static WebElement shopByBrandMenu;
	
	@FindBy(how=How.XPATH, using=username)
	@CacheLookup
	public static WebElement login_username;
	
	@FindBy(how=How.XPATH, using=password)
	@CacheLookup
	public static WebElement login_password;
	
	@FindBy(how=How.XPATH, using=logIn)	
	public static WebElement loginButton;
	
	@FindBy(how=How.XPATH, using=logOut)	
	public static WebElement logOutLink;	
	
	@FindBy(how=How.XPATH, using=signUpEmail)
	@CacheLookup
	public static WebElement signUpEmailBox;
	
	@FindBy(how=How.XPATH, using=signUpPassword)
	@CacheLookup
	public static WebElement signUpPasswordBox;
	
	@FindBy(how=How.XPATH, using=signUpReEnterPassword)
	@CacheLookup
	public static WebElement signUpReEnterPasswordBox;
		
	
	@FindBy(how=How.XPATH, using=myAccountIcon)	
	public static WebElement myAccountField;
	
	@FindBy(how=How.XPATH, using=securityQuestion)	
	public static WebElement securityQuestionDropDown;
	
	@FindBy(how=How.XPATH, using=register)	
	public static WebElement registerButton;
	
	@FindBy(how=How.XPATH, using=securityAnswer)	
	public static WebElement securityAnswerField;
	
	
	
	
	
	
}
