package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.text.Collator;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class PublishersPage extends PageObject {

    @FindBy(xpath = ".//*[@id='publishers']//sorting-directive")
    List<WebElementFacade> orderButtons;
    @FindBy(xpath = ".//*[@id='publishers']//select")
    WebElementFacade booksPerPageDropdownMenu;
    @FindBy(xpath = ".//*[@id='publishers']/div[1]//a")
    WebElementFacade addPublisherButton;
    @FindBy(xpath = ".//*[@id='publishers']/ul[1]//p/a")
    List<WebElementFacade> publisherList;
    @FindBy(xpath = ".//*[@id='publishers']//sorting-directive/ul//span[@class='glyphicon glyphicon-triangle-bottom noselect']")
    List<WebElementFacade> arrowList;


    public void orderByValue(String value) {
        switch (value) {
            case "Name":
                orderButtons.get(0).click();
        }
    }

    public boolean checkPresenceOfArrow(String value) {
        boolean presence = false;
        switch (value) {
            case "Name":
                presence = arrowList.get(0).isPresent();
        }
        return presence;
    }

    public boolean checkCorrectBookOrdering(String value) throws ParseException {
//        Collator myCollator = Collator.getInstance();
        String s1 = new String();
        String s2 = new String();
        Date date1 = new Date();
        Date date2 = new Date();
        boolean b = false;
//        int result = 0;
        for (int i = 1; i < publisherList.size(); i++) {
            switch (value) {
                case "Name":
                    bookOrder(publisherList, b);
//                    s1 = booksList.get(i).findElement((By) titleField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) titleField).getText();
            }
        }
        return b;
    }

    public boolean checkNullBookOrder(String value) {
        boolean b = false;
        booksPerPageDropdownMenu.selectByValue("100");
        switch (value) {
            case "Name":
                endsWithNulls(publisherList, b);
//                for (int i = 0; i < titleList.size(); i++) {
//                    s = titleList.get(i).getText();
//                    s2 = titleList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
        }
        return b;
    }

    public static boolean endsWithNulls(List<WebElementFacade> lst, boolean b) {
        int indexOfFirstNull = lst.indexOf(null);
        if (indexOfFirstNull == -1) {
            b = true;
        } else {
            if (lst == null || lst.isEmpty()) {
                b = false;
            }
            boolean nullsFinished = false;
            for (int i = lst.size() - 1; i >= 0; i--) {
                if (lst.get(i) != null) {
                    nullsFinished = true;
                    b = true;
                } else {
                    if (nullsFinished) {
                        return false;
                    }
                }
            }
        }
        return b;
    }

    public static boolean bookOrder(List<WebElementFacade> lst, boolean b){
        Collator myCollator = Collator.getInstance();
        int result;
        String s1 = new String();
        String s2 = new String();
        for(int i = 1; i< lst.size(); i++) {
            s1 = lst.get(i).getText();
            s2 = lst.get(i-1).getText();
            result = myCollator.compare(s1, s2);
            if (result >= 0) b = true;
            else {
                b = false;
                break;
            }
        }
        return b;
    }
}
