package addDataToForm;

import java.util.concurrent.TimeUnit;

import businessLogic.pages.ui.webdriver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class addComment {
        private WebDriver driver;

      @Before
        public void setUp() throws Exception {
            driver = Driver.getWebDriverInstance();
            driver.get("http://ecsc00101f71.epam.com/");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
       @Test
       public void addContextComment(){
          for (int i=0;i<20;i++){
               driver.findElement(By.xpath("//ng-view//form//textarea")).sendKeys("zoo");
               driver.findElement(By.xpath("//ng-view//form//input[2]")).click();

          }
       }

       @After
       public void tearDown() throws Exception {
           driver.quit();
       }
        //@Test
       /* public void testUntitled() throws Exception {
            driver.get("http://ecsc00101f71.epam.com/");
            driver.findElement(By.linkText("Sign In")).click();
            driver.findElement(By.xpath("//input[@name='userName']")).click();
            driver.findElement(By.name("userName")).clear();
            driver.findElement(By.name("userName")).sendKeys("zoolog");
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys("zoolog");
            driver.findElement(By.xpath("//div[@id='loginModal']/div/div/div[2]/form/div[3]/button")).click();
            driver.findElement(By.cssSelector("strong.ng-binding")).click();
        }*/
}
