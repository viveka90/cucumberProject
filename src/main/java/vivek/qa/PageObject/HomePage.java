package vivek.qa.PageObject;

import vivek.qa.BaseClass;
import vivek.qa.Utilitis.BrowserUtil;

public class HomePage extends BaseClass {
    private static String txtHeader = "//div[@id='content']/h2[text()='My Account']";
    private static String linkLaptopAndNotebook = "(//a[text()= 'Laptops & Notebooks'])[1]";
    private static String linkShowAll = "//a[text()= 'Show AllLaptops & Notebooks']";
    private static String linkShoppingcart = "//a[@title='Shopping Cart']";

    public static void validateHeader(String expectedText){
        BrowserUtil.validateText(txtHeader,expectedText);
    }

    public static void clickLink(){
        BrowserUtil.hoverElementAndClick(linkLaptopAndNotebook,linkShowAll );

    }

    public static void clickOnShoppingCart(){
        BrowserUtil.clickElement(linkShoppingcart);
    }
}
