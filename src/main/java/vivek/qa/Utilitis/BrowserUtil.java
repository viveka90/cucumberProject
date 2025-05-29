package vivek.qa.Utilitis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import vivek.qa.BaseClass;

import java.time.Duration;
import java.util.Properties;
import java.util.function.Function;

public class BrowserUtil extends BaseClass {
    static Properties properties = propertiesUtil.loadFrameworkProperties();
    public static void clickElement(String element){
        findcustomElement(element).click();
    }

    public static void hoverElement(String element){
        Actions action = new Actions(driver);
        action.moveToElement(findcustomElement(element)).build().perform();
    }


    public static void hoverElementAndClick(String element1,String element2){
        Actions action = new Actions(driver);
        action.moveToElement(findcustomElement(element1)).click(findcustomElement(element2)).build().perform();
    }


    public static void enterText(String element,String text){
        findcustomElement(element).clear();
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

    public static String getText(String element){
        return findcustomElement(element).getText();
        //return driver.findElement(By.xpath(element)).getText();
    }


    public static void validateText(String xpathLocator, String expectedText){
        String actualText =  findcustomElement(xpathLocator).getText();
        Assert.assertEquals("Assert Failed, actual Text is "+actualText+" but expected is "+expectedText,actualText, expectedText);
    }

    public static void validateValue(String xpathLocator, String expectedText){
        String actualText =  findcustomElement(xpathLocator).getAttribute("value");
        Assert.assertEquals("Assert Failed, actual value is "+actualText+" but expected is "+expectedText, actualText, expectedText);
    }

    public static WebElement findcustomElement(String locator){
        String timeout = properties.getProperty("timeout.maximum");
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(Long.parseLong(timeout))) // Maximum wait time
                .pollingEvery(Duration.ofSeconds(5)) // Check every 5 seconds
                .ignoring(NoSuchElementException.class); // Ignore NoSuchElementException

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(locator));
            }
        });

        return element;

    }

    public static WebDriver getBrowserDriver(String browserName){
        if  (browserName.equals("chrome")){
            driver = setChromeDriver();
        }
        else if (browserName.equals("firefox")){
            driver = setFirefoxDriver();
        }
        else if (browserName.equals("edge")){
            driver = setEdgeDriver();
        }
        return driver;
    }

    private static WebDriver setFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    private static WebDriver setEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        return driver;
    }

    private static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
