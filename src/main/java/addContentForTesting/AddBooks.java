package addContentForTesting;


import businessLogic.pages.ui.webdriver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddBooks {
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
        driver.findElement(By.xpath("//a[@href='/books/new']")).click();
        //driver.findElement(By.xpath("//a[@href='/books']")).click();
    }

    @Test
    public void addContextComment() {
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//*[@id='title']")).sendKeys("TestBooks");
            driver.findElement(By.xpath("//*[@id='publishLang']")).click();
            driver.findElement(By.xpath("//*[@id='publishLang']//option[@value='1']")).isSelected();
            driver.findElement(By.xpath("//*[@id='publisher']")).click();
            driver.findElement(By.xpath("//*[@id='publisher']//option[@value='26']")).isSelected();
            driver.findElement(By.xpath("//*[@id='publishYear']")).clear();
            driver.findElement(By.xpath("//*[@id='publishYear']")).sendKeys("2010");
            //driver.findElement(By.xpath("//*[@id='subgenre']")).click();
            driver.findElement(By.xpath("//*[@id='subgenre']//option[@value='2']")).isSelected();
            driver.findElement(By.xpath("//*[@id='submit']")).click();
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
