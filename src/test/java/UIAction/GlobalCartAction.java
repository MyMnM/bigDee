package UIAction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import helpers.GlobalUtil;
import junit.framework.Assert;
import pageobjects.GlobalCartOR;
import pageobjects.homePageOR;
import pageobjects.productListOR;

public class GlobalCartAction extends GlobalUtil {
	
	public static void validatePrice(WebDriver driver) throws InterruptedException {
		executionDelay(7000);
		List<WebElement> elements_PriceOfEachItem = mutilpleOccurenceOfElement(driver, GlobalCartOR.globalCartPrice);		
		executionDelay(7000);		
		float total = 0.0f;
		hoverMouse(homePageOR.cartIcon, driver);
		for(int i=0;i<elements_PriceOfEachItem.size();i++) {			
			executionDelay(5000);						
			float price = Float.parseFloat((elements_PriceOfEachItem.get(i).getText().split("\\$"))[1]);
			total = total + price;
		}
		System.out.println("total "+total);
		System.out.println("totla2 "+GlobalCartOR.globalCartTotalValue.getText());
		Assert.assertTrue("Item is not added to the cart",GlobalCartOR.globalCartTotalValue.getText().contains(total+ ""));
	}

}
