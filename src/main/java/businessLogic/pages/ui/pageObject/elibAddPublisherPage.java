package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class elibAddPublisherPage extends PageObject {
    @FindBy (id="Name")
    private WebElementFacade fieldNamePublisher;
    @FindBy (id="submit")
    private WebElementFacade buttonSubmitAddPublisher;

    public void clickButtonSubmitAddPublisher(){
        if(buttonSubmitAddPublisher.isDisplayed()){
            buttonSubmitAddPublisher.click();
        }else{
            System.out.println("Not found WebElement: buttonSubmitAddPublisher");
        }
    }

    public void setFieldNamePublisher(String namePublisher) {
        if (fieldNamePublisher.isDisplayed()) {
            fieldNamePublisher.clear();
            fieldNamePublisher.sendKeys(namePublisher);
        } else {
            System.out.println("Not found WebElement: fieldNamePublisher");
        }
    }

}
