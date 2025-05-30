package vivek.qa.PageObject;

import vivek.qa.BaseClass;
import vivek.qa.Utilitis.BrowserUtil;

public class ProductPage extends BaseClass {
    private static String txtHeader = "//div[@id='content']/h2";
    private static String linkMacBook = "//a[contains(text(),'MacBook')]";
    private static String buttonAddToCart = "//button[@id='button-cart']";
    private static String productPrice = "//div[@id='product']/preceding-sibling::ul//h2";
    private static String productName = "//div[@id='product']/preceding-sibling::h1";

    public static void validateHeader(String expectedText){
        BrowserUtil.validateText(txtHeader,expectedText);
    }

    public static void validateProductName(String expectedText){
        BrowserUtil.validateText(productName,expectedText);
    }

    public static void clickOnProduct(String expectedText){
        //BrowserUtil.clickElement("//a[contains(text(),'"+expectedText+"')]");
        BrowserUtil.clickElementWithJS("//a[contains(text(),'HP LP3065')]");
    }


    public static void clickAddToCart(){
        BrowserUtil.clickElement(buttonAddToCart);
    }
}
