package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class elibAddPublisherPage extends PageObject {
    @FindBy (id="Name")
    private WebElementFacade fieldNamePublisher;
    @FindBy (id="submit")
    private WebElementFacade buttonSubmitAddPublisherPage;

}
