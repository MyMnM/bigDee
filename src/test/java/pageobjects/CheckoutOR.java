package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutOR {
	
	public final static String checkoutAsGuest = "//a[contains(text(),'Checkout as guest')]";
	public final static String continueAsGuest = "//a[contains(text(),'Continue As Guest')]";	
	public final static String checkoutLogin = "//span[contains(text(),'Registered customer?')]";	
	public final static String shipToNext = "(//button[contains(text(),'Continue')])[1]";	
	public final static String shipMethodNext = "(//button[contains(text(),'Continue')])[2]";	
	public final static String paymentNext = "(//button[contains(text(),'Continue')])[3]";	
	public final static String checkoutFirstName = "(//input[@name='firstname'])[1]";
	public final static String checkoutLastName = "(//input[@name='lastname'])[1]";
	public final static String checkoutAddressLine1 = "(//input[@name='address-line-1'])[1]";
	public final static String checkoutCity = "(//input[@name='city'])[1]";
	public final static String checkoutPostalCode = "(//input[@name='postal-code'])[1]";
	public final static String checkoutPhoneNumber = "(//input[@name='shippingphone'])[1]";
	public final static String checkoutProvince= "//select[@data-mz-value='address.stateOrProvince']";	
	public final static String checkoutCardNumber = "//input[@id='mz-payment-credit-card-number']";
	public final static String checkoutCardName = "//input[@id='mz-payment-credit-card-name']";
	public final static String checkoutExpiryMonth = "//select[@class='mz-l-formfieldgroup-halfsize expiry-month']";
	public final static String checkoutExpiryYear = "//select[@name='mz-payment-expiration-year']";
	public final static String checkoutCVVNumber = "//input[@id='mz-payment-security-code']";	
	public final static String checkoutSameBillingAddress = "//input[@data-mz-value='isSameBillingShippingAddress']";
	public final static String billingEmail = "//input[@id='billing-email']";
	public final static String placeOrder = "//button[contains(text(),'Place Order')]";
	public final static String orderConfirmationTitle = "//h4[contains(text(),'Thank You For Your Order!')]";
		
	
	@FindBy(how=How.XPATH, using=checkoutAsGuest)
	@CacheLookup
	public static WebElement checkoutAsGuestButton;
	
	@FindBy(how=How.XPATH, using=continueAsGuest)
	@CacheLookup
	public static WebElement continueAsGuestButton;
	
	@FindBy(how=How.XPATH, using=checkoutLogin)
	@CacheLookup
	public static WebElement loginLink;	

	@FindBy(how=How.XPATH, using=shipToNext)	
	public static WebElement shipToNextButton;
	
	@FindBy(how=How.XPATH, using=checkoutFirstName)
	
	public static WebElement firstNameField;
	
	@FindBy(how=How.XPATH, using=checkoutLastName)
	
	public static WebElement lastNameField;
	
	@FindBy(how=How.XPATH, using=checkoutAddressLine1)
	@CacheLookup
	public static WebElement addressLine1;
	
	@FindBy(how=How.XPATH, using=checkoutCity)
	@CacheLookup
	public static WebElement cityField;
	
	@FindBy(how=How.XPATH, using=checkoutPostalCode)	
	public static WebElement postalCode;
	
	@FindBy(how=How.XPATH, using=checkoutPhoneNumber)
	
	public static WebElement phoneNumber;
	
	
	@FindBy(how=How.XPATH, using=billingEmail)
	@CacheLookup
	public static WebElement billingEmailId;
	
	@FindBy(how=How.XPATH, using=shipMethodNext)	
	public static WebElement shipMethodNextButton;
	
	@FindBy(how=How.XPATH, using=paymentNext)	
	public static WebElement paymentNextButton;
	
	@FindBy(how=How.XPATH, using=checkoutCardNumber)	
	public static WebElement creditCardNumber;
	
	@FindBy(how=How.XPATH, using=checkoutCardName)	
	public static WebElement cardName;
	
	@FindBy(how=How.XPATH, using=checkoutExpiryMonth)	
	public static WebElement cardExpiryMonth;
	
	@FindBy(how=How.XPATH, using=checkoutExpiryYear)	
	public static WebElement cardExpiryYear;
	
	@FindBy(how=How.XPATH, using=checkoutCVVNumber)	
	public static WebElement cardCVVNumber;	
	
	@FindBy(how=How.XPATH, using=checkoutProvince)	
	public static WebElement checkoutProvinceDropDown;
	
	@FindBy(how=How.XPATH, using=checkoutSameBillingAddress)	
	public static WebElement sameBillingAddress;
	
	@FindBy(how=How.XPATH, using=placeOrder)	
	public static WebElement placeOrderButton;
	
	
	
	

	
	
	

}
