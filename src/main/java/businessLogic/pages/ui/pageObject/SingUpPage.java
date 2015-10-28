package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class SingUpPage extends PageObject {
    @FindBy(xpath = "//input[@name='userName']")
    private WebElementFacade fieldLoginSingUp;
    @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade fieldEmailSingUp;
    @FindBy(xpath = "//input[@name = 'password']")
    private WebElementFacade fieldPasswordSingUp;
    @FindBy(className = "btn btn-primary btn-md btn-block")
    private WebElementFacade buttonSingUp;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.userName.$error.required']")
    private WebElementFacade messageUserNameRequired;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.email.$error.required']")
    private WebElementFacade mesageEmailRequired;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.email.$error.email']")
    private WebElementFacade messageEmailInvalid;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.password.$error.required']")
    private WebElementFacade messagePasswordRequired;

    public void setFieldLogin(String userName) {
        if (fieldLoginSingUp.isDisplayed()) {
            fieldLoginSingUp.clear();
            fieldLoginSingUp.sendKeys(userName);
        } else {
            System.out.println("Not found WebElement: fieldLoginSingUp");
        }
    }

    public void setFieldEmailSingUp(String email) {
        if (fieldEmailSingUp.isDisplayed()) {
            fieldEmailSingUp.clear();
            fieldEmailSingUp.sendKeys(email);
        } else {
            System.out.println("Not found WebElement: fieldEmailSingUp");
        }
    }

    public void setFieldPasswordSingUp(String password) {
        if (fieldPasswordSingUp.isDisplayed()) {
            fieldPasswordSingUp.clear();
            fieldPasswordSingUp.sendKeys(password);
        } else {
            System.out.println("Not found WebElement: fieldPasswordSingUp");
        }
    }

    public void clickButtonSubmitSingUp() {
        if (buttonSingUp.isDisplayed()) {
            if (buttonSingUp.isEnabled()) {
                buttonSingUp.click();
            } else {
                System.out.println("The buttonSingUp is not enabled");
            }
        } else {
            System.out.println("Not found WebElement: buttonSingUp");
        }
    }
}
