package step_definitions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.SendEmail;



/**
 * this is the runner file for running with TestNG.
 * @author vibhav.gupta
 *
 */
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target2/cucumber-html-report",
				   "json:target/cucumber.json",
				   "rerun:target/rerun.txt",
				   "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		            		
		},
		tags = {"@MyAccount2"}
		)
public class MyAccountRunnerTest extends AbstractTestNGCucumberTests{
   /*
    public static WebDriver driver;
    
 
    DesiredCapabilities capabilities=null;
	@BeforeClass
	public  void setUp() {
		
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
     

    	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
          DesiredCapabilities capabilities = DesiredCapabilities.firefox();
          capabilities.setCapability("marionette", true);
          driver = new FirefoxDriver(capabilities);
	}
	*/
	@AfterClass
    public static void teardown() throws IOException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 7");
        Reporter.setTestRunnerOutput("Output");
        SendEmail.sendEmailReport();
        
        
       // driver.quit();
      
    }
	 /*@After
	    
	    public void embedScreenshot(Scenario scenario) throws IOException, InterruptedException {
	       
	        System.out.println("in after");
	    	if(scenario.isFailed()) {
	    		
	        try {
	        	System.out.println("in failed");
	        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
	        	 String scFileName = "ScreenShot_" + System.currentTimeMillis();
				 String screenshotFilePath = System.getProperty("user.dir")+"\\ExecutionReports\\FailedScreenshots" + "\\" + scFileName + ".png";
	             byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	             FileOutputStream fileOuputStream = new FileOutputStream(screenshotFilePath); 
				 System.out.println("screen3");
				 fileOuputStream.write(screenshot);
				 
	             scenario.embed(screenshot, "image/png");
	             Thread.sleep(5000);
	             Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\target2\\cucumber-html-report\\embedded0.png");
	        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
	            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	        }
	        
	        }
	 }*/
}

	
	
