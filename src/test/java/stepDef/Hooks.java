package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import vivek.qa.BaseClass;

public class Hooks extends BaseClass {
    @Before
    public void setup(){

        initializeDriver();
    }
    @After
    public void tearDown(){

        closeDriver();
    }

    public void netBankingSetup(){

    }
    public void mortgageSetup(){

    }
}
