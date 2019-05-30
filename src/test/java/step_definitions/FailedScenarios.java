package step_definitions;
import java.io.File;
import java.io.IOException;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.SendEmail;



/**
 * this is the runner file for running with TestNG.
 * @author vibhav.gupta
 *
 */
@CucumberOptions(
		features = "@target/rerun.txt",
		plugin = {"pretty", "html:target2/cucumber-html-report",
				   "json:target/cucumber.json",	
				   "rerun:target/rerun.txt",
				   "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		            		
		}
		
		)
public class FailedScenarios extends AbstractTestNGCucumberTests{
	@AfterClass
    public static void teardown() throws IOException, InterruptedException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", System.getProperty("os.name"));
        Reporter.setTestRunnerOutput("Output");
        //Thread.sleep(30000);
        SendEmail.sendEmailReport();
        
      
    }
}