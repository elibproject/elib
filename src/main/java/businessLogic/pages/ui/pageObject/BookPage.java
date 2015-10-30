package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://ecsc00101f71.epam.com/books")
public class BookPage extends PageObject {

    @FindBy(xpath = "//li[1]/span[1]")
    WebElementFacade titleOrderButton;
    @FindBy(xpath = "//li[2]/span[1]")
    WebElementFacade yearOrderButton;
    @FindBy(xpath = "//li[3]/span[1]")
    WebElementFacade authorOrderButton;
    @FindBy(xpath = "//li[4]/span[1]")
    WebElementFacade publisherOrderButton;
    @FindBy(xpath = "//li[5]/span[1]")
    WebElementFacade ratingOrderButton;
    @FindBy(xpath = "//li[6]/span[1]")
    WebElementFacade dateOrderButton;
    @FindBy(xpath = "//*[@id='books']//select")
    WebElementFacade booksPerPageDropdownMenu;
    @FindBy(xpath = "//*[@id='books']/div[1]//a")
    WebElementFacade addBookButton;
    @FindBy(xpath = "//*[@id='books']/div[3]/div/ul")
    List<WebElementFacade> booksList;

    public void orderByTitle() {
        titleOrderButton.click();
    }

    public void orderByYear() {
        yearOrderButton.click();
    }

    public void orderByAuthor() {
        authorOrderButton.click();
    }

    public void orderByPublisher() {
        publisherOrderButton.click();
    }

    public void orderByRating() {
        ratingOrderButton.click();
    }

    public void orderByDate() {
        dateOrderButton.click();
    }

    public void selectBooksPerPage(String value) {
        booksPerPageDropdownMenu.selectByValue(value);
    }

    public AddBookPage addBook() {
        addBookButton.click();
        return new AddBookPage();
    }

}
