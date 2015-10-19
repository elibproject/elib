package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Irinka on 10/19/2015.
 */
public class elibAddBookPage extends PageObject {
    @FindBy(name="title")
    private WebElementFacade fieldTitle;
    @FindBy(name="authors")
    private WebElementFacade fieldAuttors;
    @FindBy (name="isbn")
    private WebElementFacade fieldIsbn;
    @FindBy(name="publishLanguage")
    private WebElementFacade fieldLanguagePublish;
    @FindBy (xpath ="//ng-view//form/div[6]/div[2]/select")
    private WebElementFacade fieldLanguageOriginal;
    @FindBy (name="publisher")
    private WebElementFacade fieldPublisher;
    @FindBy (name="yearOfPublishing")
    private WebElementFacade fieldYearOfPublisher;
    @FindBy (name="Category")
    private WebElementFacade fieldCategory;
    @FindBy (name="subgenre")
    private WebElementFacade fieldSubgenre;
    @FindBy (xpath=".//*[@id='description']")
    private WebElementFacade fieldDescription;
}
