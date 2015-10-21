package businessLogic.pages.ui.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static final String DEFAULT_WEB_DRIVER = "DEFAULT_WEB_DRIVER";
    private static DriversType defaultWebDriver = DriversType.FIREFOX;
    private static HashMap<String, WebDriver> instances;

    static {
        instances = new HashMap<String, WebDriver>();
    }

    public static WebDriver getWebDriverInstance(String name, DriversType driversType) {
        WebDriver driver;
        if (!instances.containsKey(name)) {
            switch (driversType) {
                case FIREFOX:
                    driver = new FirefoxDriver();
                    break;
                case CHROM:
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new UnknownDriversTypeExceptio("Unknown webDriver specified: " + driversType.getDriverName());
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            instances.put(name,driver);
        }else{
            driver=instances.get(name);
        }
        return driver;
    }
    public static WebDriver getWebDriverInstance(String name){
        return getWebDriverInstance(name, defaultWebDriver);
    }
    public static WebDriver getWebDriverInstance(){
        return getWebDriverInstance(DEFAULT_WEB_DRIVER,defaultWebDriver);
    }
}
