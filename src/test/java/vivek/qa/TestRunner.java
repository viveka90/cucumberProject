package vivek.qa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) //means we are running a cucumber class without a Junit runner
@CucumberOptions(
        //Since feature file in in diff path, we need to define it here
        features = {"src/test/resources/features/login.feature","src/test/resources/features/shoppingCart.feature"},
        //features = {"src/test/resources/features/login.feature"},
        plugin = {
                "pretty", //makes the report readable
                "html:target/cucumber.html", //path where the report will be created
                "json:target/cucumber.json"
        },
        //tags="@regression or @smoke",
        tags="@regression",
        publish=true
)

public class TestRunner {


}
