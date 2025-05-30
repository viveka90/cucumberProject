package CucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features",//use this path as features
        glue="stepDef", //searches the entire directory for the package name where step defenition is done
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true //output in plain english instead of base64
        //tags="@regression"
        //tags="not @regression" 
        //tags="@smoke or  @regression"
)
public class TestNGRunner extends AbstractTestNGCucumberTests { //makes the testng runner works
}
