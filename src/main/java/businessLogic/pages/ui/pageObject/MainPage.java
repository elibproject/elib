package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://ecsc00101f71.epam.com/")
public class MainPage extends PageObject {
    //Books with the highest rating   -->need to refactor xpath
    //@FindBy(xpath = "//ng-view//h1")  //*******for check context??
    //private WebElementFacade sectionHigestRatingBooks;
    @FindBy(xpath = "//ng-view//ul/li[1]/a")
    private WebElementFacade previousHigestRatingButton;
    @FindBy(xpath = "//ng-view//ul/li[2]/a")
    private WebElementFacade nextHigestRatingbutton;
    @FindBy(xpath = "//ng-view//div[1]/figure")
    private WebElementFacade oneBookHigestRating;
    @FindBy(xpath = "//ng-view//div[2]/figure")
    private WebElementFacade twoBookHigestRating;
    @FindBy(xpath = "//ng-view//div[3]/figure")
    private WebElementFacade threeBookHigestRating;
    @FindBy(xpath = "//ng-view//div[4]/figure")
    private WebElementFacade fourBookHigestRating;
    @FindBy(xpath = "//ng-view//div[5]/figure")
    private WebElementFacade fiveBookHigestRating;
    @FindBy(xpath = "//ng-view//div[6]/figure")
    private WebElementFacade sixBookHigestRating;
    //New books -->need to refactor xpath
    @FindBy(xpath = "//ng-view/div/h1")
    private WebElementFacade sectionNewBooks;
    @FindBy(xpath = "//div[1]/div[2]/ng-view//ul/li[1]/a")
    private WebElementFacade buttonPreviousSectionNewBooks;
    @FindBy(xpath = "//ng-view/div/ul/li[2]/a")
    private WebElementFacade buttonNextSectionNewBooks;
    @FindBy(xpath = "//ng-view//div[2]/div[1]/figure")
    private WebElementFacade oneNewBooks;
    @FindBy(xpath = "//ng-view//div[2]/div[2]/figure")
    private WebElementFacade twoNewBooks;
    @FindBy(xpath = "//ng-view//div[2]/div[3]/figure")
    private WebElementFacade threeNewBooks;
    @FindBy (xpath = "//ng-view//div[2]/div[4]/figure")
    private WebElementFacade fourNewBooks;
    @FindBy(xpath = "//ng-view//div[2]/div[5]/figure")
    private WebElementFacade fiveNewBooks;
    @FindBy(xpath = "//ng-view//div[2]/div[6]/figure")
    private WebElementFacade sixNewBooks;
    @FindBy(className = "col-md-12 bg-success")
    private WebElementFacade footerMainPage;

}
