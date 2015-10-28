package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SingInPage extends PageObject {
    
    @FindBy(name = "userName")
    private WebElementFacade fieldLogin;
    @FindBy(name = "password")
    private WebElementFacade fieldPassword;
    @FindBy(linkText = "Forgot your password?")
    private WebElementFacade linkForgotYourPassword;
    @FindBy(linkText = "Sign Up")
    private WebElementFacade linkSingUp;
    @FindBy(className = "btn btn-primary btn-md btn-block")
    private WebElementFacade buttonSingIn;

    public void setFieldLogin(String userName) {
        if (fieldLogin.isDisplayed()) {
            fieldLogin.clear();
            fieldLogin.sendKeys(userName);
        } else {
            System.out.println("Not found WebElement: fieldLogin");
        }
    }

    public void setFieldPassword(String password){
        if (fieldPassword.isDisplayed()){
            fieldPassword.clear();
            fieldPassword.sendKeys(password);
        }else{
            System.out.println("Not found WebElement: fieldPassword");
        }
    }


}
