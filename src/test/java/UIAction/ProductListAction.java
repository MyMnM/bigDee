package UIAction;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.ConfigReader;
import helpers.GlobalUtil;
import pageobjects.productListOR;
import step_definitions.Hooks;

public class ProductListAction extends GlobalUtil {	

	public static void isQuickViewDisplayed(WebDriver driver) throws InterruptedException {
		List<WebElement> elements_ProductImage = mutilpleOccurenceOfElement(driver, productListOR.productImage);
		List<WebElement> elements_QuickView = mutilpleOccurenceOfElement(driver, productListOR.quickView);
		int count = countOfElements(driver, productListOR.productImage);
		for(int i=0;i<count;i++) {
			hoverMouse(elements_ProductImage.get(i), driver);
			highlight(elements_QuickView.get(i), driver);
			Assert.assertTrue("Quick view is not coming", elements_QuickView.get(i).isDisplayed());
		}
		
		
	}
	
}
