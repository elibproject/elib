package addDataToForm;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class addComment {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http:/http://ecsc00101f71.epam.com//";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
       public void addContextComment(){
           for (int i=0;i<500;i++){
           driver.findElement(By.name("password")).click();
           driver.findElement(By.name("password")).sendKeys("zoolog");
          // driver.findElement()
           }
       }
     /*   @Test
        public void testUntitled() throws Exception {
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
