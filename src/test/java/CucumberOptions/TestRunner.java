package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //means we are running a cucumber class without a Junit runner
@CucumberOptions(
        //Since feature file in in diff path, we need to define it here
        features = {"src/test/resources/features/shoppingCart.feature"},
        //dryRun = true, //it will not execute, but just compiles and tell the issue
        //features = {"src/test/resources/features/login.feature"},
        glue="stepDef",
        plugin = {
                "pretty", //makes the report readable and colourful
                "html:target/cucumber.html", //type of report file to be cerated and path where the report will be created
                "json:target/cucumber.json"
        },
        //tags="@regression or @smoke",
        tags = "@regression",
        publish = true
)

public class TestRunner {


}
