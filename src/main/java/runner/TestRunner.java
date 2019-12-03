package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Miraj Kumar\\Desktop\\NewTest\\Demo\\src\\main\\java\\feature\\login.feature"
		,glue= {"stepDefinition"}
		)

public class TestRunner {
	


}
