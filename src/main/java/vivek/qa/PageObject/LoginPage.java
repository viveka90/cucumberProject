package vivek.qa.PageObject;

import org.openqa.selenium.By;
import vivek.qa.BaseClass;
import vivek.qa.Utilitis.BrowserUtil;

public class LoginPage extends BaseClass {
    private static String txtEmail = "//input[@name='email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin = "//input[@value='Login']";
    private static String linkForgotPAssword = "(//a[text()='Forgotten Password'])[1]";

    public static void enterUserName(String userName){
        BrowserUtil.enterText(txtEmail,userName );
    }

    public static void enterPassword(String password){
        BrowserUtil.enterText(txtPassword,password );
    }

    public static void clickLogin(){
        BrowserUtil.clickElement(btnLogin);
    }
}
