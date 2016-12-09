package Annotation; 

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests; 

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report"})
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
 
public class RunTest extends AbstractTestNGCucumberTests{
	
	
	
}