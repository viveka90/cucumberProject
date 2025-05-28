package vivek.qa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import vivek.qa.BaseClass;
import vivek.qa.PageObject.LoginPage;
import vivek.qa.Utilitis.propertiesUtil;

import java.util.Properties;

public class LoginStepdefs extends BaseClass {

    Properties properties = propertiesUtil.loadUserProperties();
    String userName = properties.getProperty("username");
    String Password = properties.getProperty("password");
    @Given("user enters valid user name in the email field")
    public void userEntersValidUserNameInTheEmailField() {
        LoginPage.enterUserName(userName);
    }

    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        LoginPage.enterPassword(Password);
    }

    @When("user click on the login button")
    public void userClickOnTheLoginButton() {
        LoginPage.clickLogin();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("user enters invalid UserName in the email field")
    public void userEntersInvalidUserNameInTheEmailField() {
    }

    @And("user enters invalid Password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {
    }

    @Then("user login failed and Error message is displayed")
    public void userLoginFailedAndErrorMessageIsDisplayed() {
    }
}
