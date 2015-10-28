package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SingInPage extends PageObject {

    @FindBy(xpath = "//input[@name='userName']")
    private WebElementFacade fieldLogin;
    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade fieldPassword;
    @FindBy(xpath = "//*[a='Forgot your password?']")
    private WebElementFacade linkForgotYourPassword;
    @FindBy(xpath = "//*[a='Sign Up']")
    private WebElementFacade linkSingUp;
    @FindBy(xpath = "//button[@data-ng-click='loginCtrl.login()']")
    private WebElementFacade buttonSingIn;
    @FindBy(xpath = "//*[@id='loginModal']//label[@ng-show='loginForm.userName.$error.required']")
    private WebElementFacade messageLoginEmpty;
    @FindBy(xpath = "//*[@id='loginModal']//label[@ng-show='loginForm.password.$error.required']")
    private WebElementFacade messagePasswordEmpty;
    @FindBy(xpath = "//*[@id='loginModal']//div[@class='alert alert-danger ng-binding']")
    private WebElementFacade messagePasswordWrong;

    public void setFieldLogin(String userName) {
        if (fieldLogin.isDisplayed()) {
            fieldLogin.clear();
            fieldLogin.sendKeys(userName);
        } else {
            System.out.println("Not found WebElement: fieldLogin");
        }
    }

    public void setFieldPassword(String password) {
        if (fieldPassword.isDisplayed()) {
            fieldPassword.clear();
            fieldPassword.sendKeys(password);
        } else {
            System.out.println("Not found WebElement: fieldPassword");
        }
    }

    public void clickButtonSingIn() {
        if (buttonSingIn.isDisplayed()) {
            if (buttonSingIn.isEnabled()) {
                buttonSingIn.click();
            } else {
                System.out.println("The buttonSingIn is not enabled");
            }
        } else {
            System.out.println("Not found WebElement: buttonSingIn");
        }
    }

    public void clickLinkForgotYourPassword() {
        if (linkForgotYourPassword.isEnabled()) {
            linkForgotYourPassword.click();
        } else {
            System.out.println("Not found WebElement: linkForgotYourPassword");
        }
    }

    public void clickLinkSingUp() {
        if (linkSingUp.isDisplayed()) {
            linkSingUp.click();
        } else {
            System.out.println("Not found WebElement: linkSingUp");
        }
    }
}
