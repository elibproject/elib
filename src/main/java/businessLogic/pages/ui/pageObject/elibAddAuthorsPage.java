package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class elibAddAuthorsPage extends PageObject {
    @FindBy(id = "first-name")
    private WebElementFacade fieldFirstName;
    @FindBy(id = "last-name")
    private WebElementFacade fieldLastName;
    @FindBy(id = "date-of-birth")
    private WebElementFacade fieldDateOfBirth;
    @FindBy(id = "date-of-death")
    private WebElementFacade fieldDateOfDeath;
    @FindBy(id = "description")
    private WebElementFacade fieldDescriptionAddAuthorsPage;
    @FindBy(id = "submit")
    private WebElementFacade buttonSubmitAddAuthorsPage;



}
