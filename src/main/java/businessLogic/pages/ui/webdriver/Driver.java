package businessLogic.pages.ui.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class Driver {
    private static final String DEFAULT_WEB_DRIVER = "DEFAULT_WEB_DRIVER";
    private static DriversType defaultWebDriver = DriversType.FIREFOX;
    private static HashMap<String,WebDriver> instances;
    static{
        instances=new HashMap<String,WebDriver>();
    }
    public static WebDriver getWebDriverInstance(String name, DriversType driversType){
        WebDriver driver;
        if(!instances.containsKey(name)){
            switch (driversType){
                case FIREFOX:
                    driver = new FirefoxDriver();
                    break;
                case CHROM:
                    driver = new ChromeDriver();
                    break;
                default:
                    throw new UnknownDriversTypeExceptio("Unknown webDriver specified: "+DriversType.getDriverName());
            }
        }
        return null;
    }

  }
