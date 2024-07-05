package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ={"C:\\Users\\Dell\\eclipse-workspace\\Health_Insurance\\Features\\Login.feature","C:\\Users\\Dell\\eclipse-workspace\\Health_Insurance\\Features\\HomePage.feature"},
		
		glue = {"StepDefination"},
		
		dryRun = false,
		
		monochrome = true,
		
		plugin = {"pretty","html:C:\\Users\\Dell\\eclipse-workspace\\Health_Insurance\\Report\\login.html"}
		
	)

public class Login_runner {

}
