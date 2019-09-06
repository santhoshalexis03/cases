package make.xx;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, plugin={"pretty","json:myrep.json"})

public class AppTest 
{
}
