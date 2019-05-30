package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountOR {
	public final static String myInformation = "(//h4[contains(text(),'My Information')])[1]";
	
	
	@FindBy(how=How.XPATH, using=myInformation)
	@CacheLookup
	public static WebElement myInformationLLink;	
	
}
