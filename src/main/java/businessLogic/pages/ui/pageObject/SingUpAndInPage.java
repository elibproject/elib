package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class SingUpAndInPage extends PageObject {
    @FindBy(xpath = "//input[@name='userName']")
    private WebElementFacade loginField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElementFacade emailField;
    @FindBy(xpath = "//input[@name = 'password']")
    private WebElementFacade passwordField;
    @FindBy(className = "btn btn-primary btn-md btn-block")
    private WebElementFacade singUpButton;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.userName.$error.required']")
    private WebElementFacade messageLoginRequiredSingUp;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.email.$error.required']")
    private WebElementFacade mesageEmailRequired;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.email.$error.email']")
    private WebElementFacade messageEmailInvalid;
    @FindBy(xpath = "//*[@id='registerModal']//" +
            "label[@ng-show='registrationForm.password.$error.required']")
    private WebElementFacade messagePasswordEmptySingUp;
    //part Sing in page
    @FindBy(xpath = "//*[a='Forgot your password?']")
    private WebElementFacade forgotPasswordLink;
    @FindBy(xpath = "//*[a='Sign Up']")
    private WebElementFacade singUpLink;
    @FindBy(xpath = "//button[@data-ng-click='loginCtrl.login()']")
    private WebElementFacade singInButton;
    @FindBy(xpath = "//*[@id='loginModal']//label[@ng-show='loginForm.userName.$error.required']")
    private WebElementFacade messageLoginEmptySingIn;
    @FindBy(xpath = "//*[@id='loginModal']//label[@ng-show='loginForm.password.$error.required']")
    private WebElementFacade messagePasswordEmptySingIn;
    @FindBy(xpath = "//*[@id='loginModal']//div[@class='alert alert-danger ng-binding']")
    private WebElementFacade messageWrongDataSingIn;

    public void setFieldLogin(String userName) {
        if (loginField.isDisplayed()) {
            loginField.clear();
            loginField.sendKeys(userName);
        } else {
            System.out.println("Not found WebElement: fieldLoginSingUp");
        }
    }

    public void setFieldEmailSingUp(String email) {
        if (emailField.isDisplayed()) {
            emailField.clear();
            emailField.sendKeys(email);
        } else {
            System.out.println("Not found WebElement: fieldEmailSingUp");
        }
    }

    public void setFieldPasswordSingUp(String password) {
        if (passwordField.isDisplayed()) {
            passwordField.clear();
            passwordField.sendKeys(password);
        } else {
            System.out.println("Not found WebElement: fieldPasswordSingUp");
        }
    }

    public void clickButtonSubmitSingUp() {
        if (singUpButton.isDisplayed()) {
            if (singUpButton.isEnabled()) {
                singUpButton.click();
            } else {
                System.out.println("The buttonSingUp is not enabled");
            }
        } else {
            System.out.println("Not found WebElement: buttonSingUp");
        }
    }

    public void clickButtonSingIn() {
        if (singInButton.isDisplayed()) {
            if (singInButton.isEnabled()) {
                singInButton.click();
            } else {
                System.out.println("The buttonSingIn is not enabled");
            }
        } else {
            System.out.println("Not found WebElement: buttonSingIn");
        }
    }

    public void clickLinkForgotYourPassword() {
        if (forgotPasswordLink.isEnabled()) {
            forgotPasswordLink.click();
        } else {
            System.out.println("Not found WebElement: linkForgotYourPassword");
        }
    }

    public void clickLinkSingUp() {
        if (singUpLink.isDisplayed()) {
            singUpLink.click();
        } else {
            System.out.println("Not found WebElement: linkSingUp");
        }
    }

    public String getMessageLoginRequiredSingUp() {
        String actualMessageLoginSingUp = "";
        if (messageLoginRequiredSingUp.isDisplayed()) {
            actualMessageLoginSingUp = messageLoginRequiredSingUp.getText();
        } else {
            System.out.println("Not found WebElement: messageLoginRequiredSingUp");
        }
        return actualMessageLoginSingUp;
    }

    public String getMessageLoginRequiredSingIn() {
        String actualMessageLoginSingIn = "";
        if (messageLoginEmptySingIn.isDisplayed()) {
            actualMessageLoginSingIn = messageLoginEmptySingIn.getText();
        } else {
            System.out.println("Not found WebElement: messageLoginEmptySingIn");
        }
        return actualMessageLoginSingIn;
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

    public String getMessagePasswordEmptySingUp() {
        String actualMessagePasswordRequiredSingUp = "";
        if (messagePasswordEmptySingUp.isDisplayed()) {
            actualMessagePasswordRequiredSingUp = messagePasswordEmptySingUp.getText();
        } else {
            System.out.println("Not found WebElement: messagePasswordEmptySingUp");
        }
        return actualMessagePasswordRequiredSingUp;
    }

    public String getMessagePasswordRequiredSingIn() {
        String actualMessagePasswordRequiredSingIn = "";
        if (messagePasswordEmptySingIn.isDisplayed()) {
            actualMessagePasswordRequiredSingIn = messagePasswordEmptySingIn.getText();
        } else {
            System.out.println("Not found WebElement: messagePasswordEmptySingIn");
        }
        return actualMessagePasswordRequiredSingIn;
    }

    public String getMessageWrongDataSingIn() {
        String actualMessageWrongDataSingIn = "";
        if (messageWrongDataSingIn.isDisplayed()) {
            actualMessageWrongDataSingIn = messageWrongDataSingIn.getText();
        } else {
            System.out.println("Not found WebElement: messagePasswordWrongSingIn");
        }
        return actualMessageWrongDataSingIn;
    }
}
