package TestRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src\\test\\Resources\\features\\VehicleRegistrationSearch.feature"},
        glue= {"StepDefinitions"},
        tags = {"@positiveTest", "@negativeTest"},
        plugin = { "pretty" , "html:target/report/cucumber", "json:target/report/json/login.json"}

)
public class Volkswagen_TestRunner {


}