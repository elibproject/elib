package businessLogic.pages.ui.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuAndSearchbarMain extends PageObject {
    //menu
    @FindBy(xpath = "//a[@href='/']")
    private WebElementFacade mainPageLink;
    @FindBy(xpath = "//a[@href='/books']")
    private WebElementFacade booksPageLink;
    @FindBy(xpath = "//a[@href='/authors']")
    private WebElementFacade authorsPageLink;
    @FindBy(xpath = "//a[@href='/publishers']")
    private WebElementFacade publishersPageLink;
    @FindBy(xpath = "//*[@id='bs-example-navbar-collapse-1']//a[@href='#']")
    private WebElementFacade genresDropdownMenu;//create method for dropdown menu!!!!!!!!!!!!!!!!!!
    @FindBy(xpath = "//a[@href='/help']")
    private WebElementFacade apiLink; // can change!
    @FindBy(xpath = "//a[@href='/login']")
    private WebElementFacade loginLink;
    @FindBy(xpath = "//a[@href='/registration']")
    private WebElementFacade registrationLink;
    //for User menu
    @FindBy(xpath = "//a[@href='/books/new']")
    private WebElementFacade newBooksLink;
    @FindBy(xpath = "//a[@href='/profile']")
    private WebElementFacade profileLink;
    @FindBy(xpath = "//a[@data-ng-click='indexCtrl.logOut()']")
    private WebElementFacade logoutLink;
    //search block
    @FindBy(id = "searchSelector")
    private WebElementFacade searchSelectorDropdown;
    @FindBy(xpath = "//input[@ng-model='search.query']")
    private WebElementFacade searchField;
    @FindBy(xpath = "//button[@ng-click='search.sendRequest()']")
    private WebElementFacade searchButton;

    public void clickMainPageLink() {
        if (mainPageLink.isDisplayed()) {
            mainPageLink.click();
        } else {
            System.out.println("Not found WebElement: mainPageLink");
        }
    }

    public void clickBooksPageLink() {
        if (booksPageLink.isDisplayed()) {
            booksPageLink.click();
        } else {
            System.out.println("Not found WebElement: booksPageLink");
        }
    }

    public void clickAuthorsPageLink() {
        if (authorsPageLink.isDisplayed()) {
            authorsPageLink.click();
        } else {
            System.out.println("Not found WebElement: authorsPageLink");
        }
    }

    public void clickPublishersPageLink() {
        if (publishersPageLink.isDisplayed()) {
            publishersPageLink.click();
        } else {
            System.out.println("Not found WebElement: publishersPageLink");
        }
    }

    //dropdown

    public void clickApiLink() {
        if (apiLink.isDisplayed()) {
            apiLink.click();
        } else {
            System.out.println("Not found WebElement: apiLink");
        }
    }

    public void clickLoginLink() {
        if (loginLink.isDisplayed()) {
            loginLink.click();
        } else {
            System.out.println("Not found WebElement: loginLink");
        }
    }

    public void clickRegistrationLink() {
        if (registrationLink.isDisplayed()) {
            registrationLink.click();
        } else {
            System.out.println("Not found WebElement: registrationLink");
        }
    }

    public void clickNewBooksLink() {
        if (newBooksLink.isDisplayed()) {
            newBooksLink.click();
        } else {
            System.out.println("Not found WebElement: newBooksLink");
        }
    }

    public void clickProfileLink() {
        if (profileLink.isDisplayed()) {
            profileLink.click();
        } else {
            System.out.println("Not found WebElement: profileLink");
        }
    }

    public void clickLogoutLink() {
        if (logoutLink.isDisplayed()) {
            logoutLink.click();
        } else {
            System.out.println("Not found WebElement: logoutLink");
        }
    }
}
