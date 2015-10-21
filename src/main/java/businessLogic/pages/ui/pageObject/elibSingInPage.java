package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class elibSingInPage extends PageObject {
    //elements SingIn page
    @FindBy(name = "userName")
    private WebElementFacade fieldLogin;
    @FindBy(name = "password")
    private WebElementFacade fieldPassword;
    @FindBy(className = "btn btn-primary btn-md btn-block")
    private WebElementFacade buttonSingIn;
    @FindBy(linkText = "Forgot your password?")
    private WebElementFacade linkForgotYourPassword;
    @FindBy(linkText = "Sign Up")
    private WebElementFacade linkSingUp;

    /*
    //methods for elements
    public WebElementFacade getFieldLogin() {
        return fieldLogin;
    }

    public void setFieldLogin(WebElementFacade fieldLogin) {
        this.fieldLogin = fieldLogin;
    }

    public WebElementFacade getFieldPassword() {
        return fieldPassword;
    }

    public void setFieldPassword(WebElementFacade fieldPassword) {
        this.fieldPassword = fieldPassword;
    }

    public void clickButtonRegistration() {
        buttonSingIn.click();
    }*/
}
