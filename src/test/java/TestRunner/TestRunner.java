package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)@CucumberOptions(features="C:\\myworkspace\\testing\\ORANGEHRM_TESTING\\src\\test\\resources\\Feature\\Test.feature",glue = "StepDef",plugin = "html:target/cucumber.html")

public class TestRunner {
	
}
