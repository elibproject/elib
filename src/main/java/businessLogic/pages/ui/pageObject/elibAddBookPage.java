package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class elibAddBookPage extends PageObject {
    @FindBy(id="title")
    private WebElementFacade fieldTitle;
    @FindBy(id="authors")
    private WebElementFacade fieldAuthors;
    @FindBy (id="isbn")
    private WebElementFacade fieldIsbn;
    @FindBy(id="publishLang")
    private WebElementFacade fieldLanguagePublish;
    @FindBy (id ="originLang")
    private WebElementFacade fieldLanguageOriginal;
    @FindBy (name="publisher")
    private WebElementFacade fieldPublisher;
    @FindBy (id="publishYear")
    private WebElementFacade fieldYearOfPublisher;
    @FindBy (id="category")
    private WebElementFacade fieldCategory;
    @FindBy (id="subgenre")
    private WebElementFacade fieldSubgenre;
    @FindBy (id="description")
    private WebElementFacade fieldDescription;
    @FindBy(id="submit")
    private WebElementFacade buttonSubmit;
}
