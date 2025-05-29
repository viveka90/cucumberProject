package vivek.qa.PageObject;

import vivek.qa.BaseClass;
import vivek.qa.Utilitis.BrowserUtil;

public class ShoppingcartPage extends BaseClass {
    private static String txtHeader = "//a[contains(text(),'Shopping Cart')]";
    private static String btnContinueShopping = "//a[contains(text(),'Continue Shopping')]";
    private static String btnCheckout = "//a[contains(text(),'Checkout')]";
    private static String txtProductName = "(//table[@class='table table-bordered'])[2]/tbody/tr/td[2]/a";
    public static void validateHeader(String expectedText) {
        BrowserUtil.validateText(txtHeader,expectedText);
    }

    public static void clickContinueShopping(){
        BrowserUtil.clickElement(btnContinueShopping);
    }

    public static void clickCheckout(){
        BrowserUtil.clickElement(btnCheckout);
    }

    public static void validateProductName(String expectedText) {
        BrowserUtil.validateText(txtProductName,expectedText);
    }
}
