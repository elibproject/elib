package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static com.gargoylesoftware.htmlunit.WebAssert.assertElementPresent;

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

   /* public void addFieldSubqenre(){    DROPDOWN MENU!!!!
        if(fieldSubgenre.isDisplayed()){
            fieldSubgenre.click();
            fieldSubgenre.clear();
            fieldSubgenre.sendKeys();
        }else{
            System.out.println("Not found element fieldDescription");
        }
    }*/

    public void addFieldDescription(){
       // assertElementPresent.fieldDescription.click();
            fieldDescription.clear();
            fieldDescription.sendKeys();
        }
           // System.out.println("Not found element fieldSubgenre");




    public void clickButtonSubmit(){
        if (buttonSubmit.isDisplayed()){
            buttonSubmit.click();
        }else{
            System.out.println("Not found element buttonSubmit");
        }
    }

}
