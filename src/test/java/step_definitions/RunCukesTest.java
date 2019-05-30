package step_definitions;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



/**
 * this is the runner class for running the feature files along with other parameters mentioned.
 * @author vibhav.gupta
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target2/cucumber-html-report",
				   "json:target/cucumber.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		            		
		},
		tags = {"@CCUI"}
		)
public class RunCukesTest{
	
	/**
	 * Tear down.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@AfterClass
    public static void teardown() throws IOException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 7");
        Reporter.setTestRunnerOutput("output");
        
      
    }
}