package helpers;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author vibhav.gupta
 *this file contains all the commonly used functions 
 */
public class GlobalUtil {
	
	
	    
/**
 *it will wait for the element to become invisible
 * @param driver
 * @param path
 */
	public static void expliciiWaitWithInvisibleElement(WebDriver driver,String path)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(path)));
	}
	
	/**
	 * it will hold the execution for the mentioned time
	 * @param time
	 * @throws InterruptedException
	 */
	public static void executionDelay(long time) throws InterruptedException
	{
	
		Thread.sleep(time);
	}
	
	public static void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	
	}
	
	
	
	/**
	 * it will input the text.It will first clear the older data and then enter the new data
	 * @param element
	 * @param value
	 */
	public static void inputText(WebElement element,String value,WebDriver driver)
	{
		highlight(element, driver);
		WebElement ele=waitForElementToBeClickable(driver,element);//explicit wait for element to appear and be clickable on the web page
		ele.clear();
		ele.sendKeys(value);
	}
	
	/**
	 * Checks if is web element enabled.
	 *
	 * @param driver the driver
	 * @param path the path
	 */
	public static void isWebElementDisplayed(WebDriver driver,String path) 
	{
		try
		{
			
			boolean element = driver.findElement(By.xpath(path)).isDisplayed();
			System.out.println("element is displayed");
		}
		catch(Exception e)
		{
			System.out.println("Handling isDisplayed method exception");
			System.out.println(e);
		}
		
	}
	
	public static void pressEnterKey(WebElement element)
	{
		element.sendKeys(Keys.RETURN);
	}
	
	
	/**
	 * it will wait for the element to become visible in DOM and on the web page before getting clicked.
	 * @param driver
	 * @param element
	 * @return
	 */
	public static WebElement waitForElementToBeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,ConfigReader.getIntValue("ExplicitWait"));
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(element));
		return ele;
	}
	
	public static void inputTextUsingJS(WebDriver driver,WebElement element,String value)
	{
		int val=Integer.parseInt(value);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].value=arguments[0];",val ,element);
	}
	
	
	public  static void clickOnElementUsingJS(WebDriver driver,WebElement element)
	{	     
		highlight(element, driver);
		waitForElementToBeClickable(driver, element);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	
	/**
	 * it will click on the element after waiting for certain time.
	 * @param driver
	 * @param element
	 */
	public static void clickOnElement(WebDriver driver,WebElement element)
	{
		//WebElement ele=waitForElementToBeClickable(driver,element);//explicit wait for element to appear and be clickable on the web page
	    element.click();
	}
	
	/**
	 * it will check if Web Element is present or not on the web page.
	 * @param driver
	 * @param path
	 */
	/*public static void isWebElementPresent(WebDriver driver,String path) 
	{
		try
		{
	
		int size=driver.findElements(By.xpath(path)).size();//checks the single or multiple occurences of the web element.
		if(size!=0)	{
			
			highlight(driver.findElement(By.xpath(path)), driver);
			executionDelay(6000);
			System.out.println("element is present");
		}
		}
		catch(Exception e) {
		
			System.out.println("it is not present");
			System.out.println(e);
		}
		
	}*/
	
	public static boolean isWebElementPresent(WebDriver driver,String path) throws InterruptedException 
	{
		
		int size=driver.findElements(By.xpath(path)).size();//checks the single or multiple occurences of the web element.
		if(size!=0)
		{
			highlight(driver.findElement(By.xpath(path)), driver);
			executionDelay(2000);
			System.out.println("element is present");
			return true;
		}
		else
		{
			return false;
		}
		
		
		
		
	}
	
	
	public static void isWebElementPresent(WebDriver driver,List<WebElement> element) 
	{
		
	
		int size=element.size();//checks the single or multiple occurences of the web element.
		if(size!=0)
		System.out.println("element present");
		else
		{
			System.out.println("element not present");
			
		}
		
		
	}
	
	public static void CompareText(WebElement element,String value)
	{
		  if(element.getText().contains(value))
		  {
			  System.out.println("Value Matched for"+value);
		  }
		  else
		  {
			  System.out.println("Value does not Matched for"+value);
		  }
	}
			
	
	/**
	 * it will return list of multiple occurrence of same web  element
	 * @param driver
	 * @param path
	 * @return list 
	 */
	public static List<WebElement> mutilpleOccurenceOfElement(WebDriver driver,String path)
	{
		List<WebElement>list=driver.findElements(By.xpath(path));//checks the single or multiple occurences of the web element.
		return list;
	}
	public static boolean isElementDisplayed(WebDriver driver,WebElement element)
	
	{
		boolean result=element.isDisplayed();
		return result;
	}
	
	/**
	 * Verify UI text.
	 *
	 * @param driver the driver
	 * @param ele1 the ele 1
	 * @param ExpectedValue the expected value
	 * @throws InterruptedException 
	 */
	public static void verifyUIText(WebDriver driver,WebElement ele1, String ExpectedValue) throws InterruptedException
	{
		highlight(ele1, driver);
		executionDelay(5000);
		System.out.println(ele1.getText());
		String actualValue = ele1.getText();
		assertEquals(ExpectedValue, actualValue, "Text not matched !!");
	}
	
	public static void SelectUsingVisibleValue(WebElement element,String visibleValue) throws InterruptedException {
		Select select = new Select(element);
		select.selectByVisibleText(visibleValue);
		
	}
	
	public static void SelectUsingIndex(WebElement element,int index) throws InterruptedException {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
	
	public static void  highlight(WebElement element,WebDriver driver) {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		         js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		  }
		   public static void unhighlightLast(WebDriver driver,WebElement element) { 
		     JavascriptExecutor js=(JavascriptExecutor) driver;
		     js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 0px;');", element);
	
	
	
	}
		   
	public static void navigateToURL(String url,WebDriver driver)
	{
		driver.navigate().to(url);
	}
		   
	public static String generateRandomNumber()
	{
		Random rand = new Random(); 
		int value = rand.nextInt(1000); 
		String num=Integer.toString(value);
		return num;
	}
	
	public static void scrollPagedown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,1500)");
	}
	public static void scrollPageUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,-100)");
	}
	public static void switchToNewBrowserTab(WebDriver driver)
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	   
	}
	
	public static void switchBackToOriginalBrowserTab(WebDriver driver)
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	   
	}
	public static void verifyWebsiteURL(WebDriver driver , String url) throws InterruptedException {	
		Assert.assertTrue(driver.getCurrentUrl().contains(url), "URL are different");
	}
	
	public static String getElementText(WebElement element,WebDriver driver) {
		return element.getText();
	}
	
	public static void hoverMouse(WebElement element,WebDriver driver) {
		highlight(element, driver);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor je = (JavascriptExecutor) driver; 	 
		// now execute query which actually will scroll until that element is not appeared on page.	 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public static int countOfElements(WebDriver driver,String path)
	{
		return driver.findElements(By.xpath(path)).size();//checks the single or multiple occurences of the web element.
		
	}
	
	public static void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}
	
	public static void openNewBrowserTab(WebDriver driver) throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);//Ctrl+T shortcut to open a new tab
		rob.keyPress(KeyEvent.VK_T);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_T);
	}
	
	public static void clickOkOnDialogBox(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
