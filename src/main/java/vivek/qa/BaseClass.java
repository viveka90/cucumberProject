package vivek.qa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import vivek.qa.Utilitis.propertiesUtil;

import java.util.Properties;

public class BaseClass {

    protected  static WebDriver driver;


    public static void initializeDriver(){
        Properties properties = propertiesUtil.loadApplicaitonProperties();
        String url = properties.getProperty("application.url").toString();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver(){
        driver.quit();
    }
}
