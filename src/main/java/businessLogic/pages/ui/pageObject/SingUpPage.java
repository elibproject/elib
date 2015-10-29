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
    @FindBy(xpath = "//*[@id='registerModal']//*[@class='ng-binding ng-hide alert alert-danger']")//check selector!
    private WebElementFacade messageSuccessfullyRegistration;

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

    public String getMessageUserNameRequired() {
        String actualMessageUserName = "";
        if (messageUserNameRequired.isDisplayed()) {
            actualMessageUserName = messageUserNameRequired.getText();
        } else {
            System.out.println("Not found WebElement: messageUserNameRequired");
        }
        return actualMessageUserName;
    }

    public String getMessageEmailRequired() {
        String actualMessageEmailRequired = "";
        if (mesageEmailRequired.isDisplayed()) {
            actualMessageEmailRequired = mesageEmailRequired.getText();
        } else {
            System.out.println("Not found WebElement: mesageEmailRequired");
        }
        return actualMessageEmailRequired;
    }

    public String getMessageEmailInvalid() {
        String actualMessageEmailInvalid = "";
        if (messageEmailInvalid.isDisplayed()) {
            actualMessageEmailInvalid = messageEmailInvalid.getText();
        } else {
            System.out.println("Not found WebElement: messageEmailInvalid");
        }
        return actualMessageEmailInvalid;
    }

    public String getMessagePasswordRequired() {
        String actualMessagePasswordRequired = "";
        if (messagePasswordRequired.isDisplayed()) {
            actualMessagePasswordRequired = messagePasswordRequired.getText();
        } else {
            System.out.println("Not found WebElement: messagePasswordRequired");
        }
        return actualMessagePasswordRequired;
    }

    public String getMessageSuccessfullyRegistration(){
        String actualMessageSuccessfullyRegistration="";
        if(messageSuccessfullyRegistration.isDisplayed()){
            messageSuccessfullyRegistration.getText();
        }else{
            System.out.println("Not found WebElement: messageSuccessfullyRegistration");
        }
        return  actualMessageSuccessfullyRegistration;
    }
}
