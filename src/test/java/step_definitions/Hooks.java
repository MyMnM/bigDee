package step_definitions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

// TODO: Auto-generated Javadoc
/**
 * this file has  blocks of code that run before or after each scenario.
 *
 * @author vibhav.gupta
 */
public class Hooks{
    
    /** The driver. */
    public static WebDriver driver;
    
    /** The capabilities. */
    DesiredCapabilities capabilities=null;
    

    
   
    /**
     * will run before  any scenario.
     * it will start the chrome browser by initializing web driver.
     *
     * @throws MalformedURLException the malformed URL exception
     */
    
    private static Logger Log = Logger.getLogger(Hooks.class);
    
    @Before
    public void openBrowser() throws MalformedURLException {
    	Log.info("************************Test Scenarios started********************");
    	System.out.println("Opening Chrome Browser------------------------------");
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("start-maximized");
    	options.addArguments("--disable-extensions");
    	options.addArguments("--disable-infobars");
    	Map<String, Object> prefs = new HashMap<String, Object>();
    	prefs.put("credentials_enable_service", false);
    	prefs.put("profile.password_manager_enabled", false);
    	prefs.put("excludeSwitches", "enable-automation");
    	options.setExperimentalOption("prefs", prefs);
    	capabilities = DesiredCapabilities.chrome();
    	capabilities.setCapability("version", "latest");
    	capabilities.setCapability("browserName", "chrome");
    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    	driver = new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.manage().deleteAllCookies();    	
    	//driver.manage().window().maximize();
     

    	/*  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
          DesiredCapabilities capabilities = DesiredCapabilities.firefox();
          capabilities.setCapability("marionette", true);
          driver = new FirefoxDriver(capabilities);*/
    
    }

     
    /**
     * will run after every scenario
     * will take screenshot at the last screen where test case failed.
     * attach the screenshot to the report output
     * close the chrome browser session  
     *
     * @param scenario the scenario
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException 
     */
    @After
    
    public void embedScreenshot(Scenario scenario) throws IOException, InterruptedException {
       
        System.out.println("in after");
    	if(scenario.isFailed()) {
    		Log.info("Test Scenarios Failed");
        try {
        	System.out.println("in failed");
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
        	 String scFileName = "ScreenShot_" + System.currentTimeMillis();
        	/* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     		 String scFileName = "ScreenShot_" + sdf.format(new Date()) + "";*/
        	// String scFileName = "ScreenShot_" + new Date() + " ";
			 String screenshotFilePath = System.getProperty("user.dir")+"\\ExecutionReports\\FailedScreenshots" + "\\" + scFileName + ".png";
             byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
             FileOutputStream fileOuputStream = new FileOutputStream(screenshotFilePath); 
			 System.out.println("screen3");
			 fileOuputStream.write(screenshot);
			 
             scenario.embed(screenshot, "image/png");
             Thread.sleep(5000);
            // Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\target2\\cucumber-html-report\\embedded0.png");
              Reporter.addScreenCaptureFromPath(screenshotFilePath);
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        Log.info("**********Test Scenarios END********************");
        }
        driver.quit();
        
    }
   
    
  
}
			