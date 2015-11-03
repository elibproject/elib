package businessLogic.pages.ui.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfilePage extends PageObject {

    //menu profile page
    @FindBy(xpath = "//a[@href='/profile']")
    private WebElementFacade generalInfoLink;
    @FindBy(xpath = "//a[@href='/profile/ratings']")
    private WebElementFacade ratingsLink;
    @FindBy(xpath = "//a[@href='/profile/comments']")
    private WebElementFacade commentsLink;
    @FindBy(xpath = "//a[@href='/profile/favs']")
    private WebElementFacade favsLink;
    @FindBy(xpath = "//a[@href='profile/books/wishlist']")
    private WebElementFacade bookToReadLink;
    @FindBy(xpath = "//a[@href='profile/books/donelist']")
    private WebElementFacade alreadyReadBooksLink;
    @FindBy(xpath = "//a[@href='profile/social-networks']")
    private WebElementFacade socialNetworksIntegrationLink;
    //part profile page (General Info)
    @FindBy(xpath = "//span[text()='Username']")
    private WebElementFacade usernameFiled;
    @FindBy(xpath = "//span[text()='First Name']")
    private WebElementFacade firstNameField;
    @FindBy(xpath = "//span[text()='Last Name']")
    private WebElementFacade lastNameField;
    @FindBy(xpath = "//span[text()='Email']")
    private WebElementFacade emailField;
    @FindBy(xpath = " //a[text()='Upload New']")
    private WebElementFacade uploadNewLink;
    @FindBy(xpath = "//btn[text()=' Edit']")
    private WebElementFacade editButtonProfilePage;
    //contain of the field
    @FindBy(xpath = "//span[text()='Username']//span[@class='info-value ng-binding']")  //login name
    private WebElementFacade infoUsernameFiled;
    @FindBy(xpath = "")
    private WebElementFacade infoFirstNameField;
    @FindBy(xpath = "")
    private WebElementFacade infoLastNameField;
    @FindBy(xpath = "")
    private WebElementFacade infoEmailField;
    //part profile page (other links)

    public void clickGeneralInfoLink() {
        if (generalInfoLink.isDisplayed()) {
            String expected = "General Info";
            String actual = generalInfoLink.getText();
            assertThat(actual).isEqualTo(expected);
            generalInfoLink.click();
        } else {
            System.out.println("Not found WebElement: generalInfoLink");
        }
    }

    public void clickRatingsLink() {
        if (ratingsLink.isDisplayed()) {
            String expected = "Ratings";
            String actual = ratingsLink.getText();
            assertThat(actual).isEqualTo(expected);
            ratingsLink.click();
        } else {
            System.out.println("Not found WebElement: ratingsLink");
        }
    }

    public void clickCommentsLink() {
        if (commentsLink.isDisplayed()) {
            String expected = "Comments";
            String actual = commentsLink.getText();
            assertThat(actual).isEqualTo(expected);
            commentsLink.click();
        } else {
            System.out.println("Not found WebElement: commentsLink");
        }
    }

    public void clickFavsLink() {
        if (favsLink.isDisplayed()) {
            favsLink.click();
        } else {
            System.out.println("Not found WebElement: favsLink");
        }
    }

    public void clickBookToReadLink() {
        if (bookToReadLink.isDisplayed()) {
            bookToReadLink.click();
        } else {
            System.out.println("Not found WebElement: bookToReadLink");
        }
    }

    public void clickAlreadyReadBooksLink() {
        if (alreadyReadBooksLink.isDisplayed()) {
            alreadyReadBooksLink.click();
        } else {
            System.out.println("Not found WebElement: alreadyReadBooksLink");
        }
    }

    public void clickSocialNetworksIntegrationLink() {
        if (socialNetworksIntegrationLink.isDisplayed()) {
            socialNetworksIntegrationLink.click();
        } else {
            System.out.println("Not found WebElement: socialNetworksIntegrationLink");
        }
    }

    public String getContextUsernameFiled() {
        String actualUsernameFiled = "";
        if (usernameFiled.isDisplayed()) {
            actualUsernameFiled = usernameFiled.getText();
        } else {
            System.out.println("Not found WebElement: usernameFiled");
        }
        return actualUsernameFiled;
    }

    public String getContextFirstNameField() {
        String actualFirstNameField = "";
        if (firstNameField.isDisplayed()) {
            actualFirstNameField = firstNameField.getText();
        } else {
            System.out.println("Not found WebElement: firstNameField");
        }
        return actualFirstNameField;
    }

    public String getContextLastNameField() {
        String actualLastNameField = "";
        if (lastNameField.isDisplayed()) {
            actualLastNameField = lastNameField.getText();
        } else {
            System.out.println("Not found WebElement: lastNameField");
        }
        return actualLastNameField;
    }

    public String getContextEmailField() {
        String actualEmailField = "";
        if (emailField.isDisplayed()) {
            actualEmailField = emailField.getText();
        } else {
            System.out.println("Not found WebElement: emailField");
        }
        return actualEmailField;
    }

    public String getContextInfoUsernameFiled() {
        String actualInfoUsernameFiled = "";
        if (infoUsernameFiled.isDisplayed()) {
            actualInfoUsernameFiled = infoUsernameFiled.getText();
        } else {
            System.out.println("Not found WebElement: infoUsernameFiled");
        }
        return actualInfoUsernameFiled;
    }

}
