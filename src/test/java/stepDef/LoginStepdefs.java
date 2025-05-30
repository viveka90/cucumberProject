package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import vivek.qa.BaseClass;
import vivek.qa.PageObject.HomePage;
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
    public void userClickOnTheLoginButton() throws InterruptedException {
        LoginPage.clickLogin();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        HomePage.validateHeader("My Account");
    }

    @Given("user enters invalid email {string} in the email field")
    public void userEntersInvalidEmailInTheEmailField(String email) {
        LoginPage.enterUserName(email);
    }

    @And("user enters invalid password {string} in the password field")
    public void userEntersInvalidPasswordInThePasswordField(String password) {
        LoginPage.enterPassword(password);
    }

    @Then("user login failed and warning message {string} is displayed")
    public void userLoginFailedAndWarningMessageIsDisplayed(String expectedError) {
        LoginPage.validateErrorMessage(expectedError);
    }

    @Given("User should be logged into the application")
    public void userShouldBeLoggedIntoTheApplication() throws InterruptedException {
        userEntersValidUserNameInTheEmailField();
        userEntersValidPasswordInThePasswordField();
        userClickOnTheLoginButton();
        userIsLoggedInSuccessfully();
    }

}
