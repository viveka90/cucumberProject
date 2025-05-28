package vivek.qa.Utilitis;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import vivek.qa.BaseClass;

import java.time.Duration;
import java.util.Properties;
import java.util.function.Function;

public class BrowserUtil extends BaseClass {
    static Properties properties = propertiesUtil.loadFrameworkProperties();
    public static void clickElement(String element){
        driver.findElement(By.xpath(element)).click();
    }

    public static void enterText(String element,String text){
        findcustomElement(element).clear();
        driver.findElement(By.xpath(element)).sendKeys(text);
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
}
