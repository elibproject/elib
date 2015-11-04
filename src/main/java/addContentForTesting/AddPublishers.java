package addContentForTesting;


import businessLogic.pages.ui.webdriver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddPublishers {
    private WebDriver driver;


    @Before
    public void setUp() throws Exception {
        driver = Driver.getWebDriverInstance();
        driver.get("http://ecsc00101f71.epam.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("zoolog");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("zoolog");
        driver.findElement(By.xpath("//*[@id='loginModal']//button[text()='Sign In']")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void addContextComment() {
        for (int i = 0; i < 3; i++) {
            // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@href='/publishers']")).click();
            driver.findElement(By.xpath("//a[@href='/publishers']")).click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id='publishers']//a[text()=' Add Publisher']")).click();
            driver.findElement(By.xpath("//*[@id='Name']")).sendKeys("1-Test");
            driver.findElement(By.xpath("//*[@id='submit']")).click();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
