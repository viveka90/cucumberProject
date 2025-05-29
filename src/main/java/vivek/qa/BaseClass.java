package vivek.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import vivek.qa.Utilitis.propertiesUtil;

import java.util.Properties;

import static vivek.qa.Utilitis.BrowserUtil.getBrowserDriver;

public class BaseClass {

    protected  static WebDriver driver;
    static Properties appproperties = propertiesUtil.loadApplicaitonProperties();
    static String url = appproperties.getProperty("application.url").toString();
    static Properties framproperties = propertiesUtil.loadFrameworkProperties();
    static String browser = framproperties.getProperty("browser");
    public static void initializeDriver(){
        getBrowserDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver(){
        driver.quit();
    }
}
