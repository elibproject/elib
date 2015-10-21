package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class elibSingUpPage extends PageObject {
    @FindBy(name="userName")
    private WebElementFacade fieldLogin;
    @FindBy(name="email")
    private WebElementFacade fieldEmail;
    @FindBy(name="password")
    private WebElementFacade fieldPassword;
    @FindBy(className = "btn btn-primary btn-md btn-block")
    private WebElementFacade buttonSingUp;
}
