package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.text.Collator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AuthorsPage extends PageObject {
    @FindBy(xpath = "//ng-view//div[3]/div/ul")
    List<WebElementFacade> authorList;
    @FindBy(xpath = "//sorting-directive")
    List<WebElementFacade> orderButtons;
    @FindBy(xpath = "//ng-view//select")
    WebElementFacade booksPerPageDropdownMenu;
    @FindBy(xpath = "//ng-view/div/div/div[1]/div[2]/a")
    WebElementFacade addAuthorButton;
    @FindBy(xpath = "//ng-view//ul//a/strong")
    List<WebElementFacade> firstAndSecondNameList;
    @FindBy(xpath = "//ng-view//ul//div/div[2]/p")
    List<WebElementFacade> dateOfBirthList;
    @FindBy(xpath = "//sorting-directive/ul//span[@class='glyphicon noselect glyphicon-triangle-bottom']")
    List<WebElementFacade> arrowList;


    public void orderByValue(String value) {
        switch (value) {
            case "FirstName":
                orderButtons.get(0).click();
            case "LastName":
                orderButtons.get(1).click();
            case "DateOfBirth":
                orderButtons.get(2).click();
        }
    }

    public boolean checkPresenceOfArrow(String value) {
        boolean presence = false;
        switch (value) {
            case "FirstName":
                presence = arrowList.get(0).isPresent();
            case "LastName":
                presence = arrowList.get(1).isPresent();
            case "DateOfBirth":
                presence = arrowList.get(2).isPresent();
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
        for (int i = 1; i < authorList.size(); i++) {
            switch (value) {
                case "FirstName":
                    bookOrder(firstAndSecondNameList, b);
//                    s1 = booksList.get(i).findElement((By) titleField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) titleField).getText();
                case "LastName":
                    bookOrder(firstAndSecondNameList, b);
//                    s1 = booksList.get(i).findElement((By) yearField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) yearField).getText();
                case "DateOfBirth":
                    bookOrderByDate(dateOfBirthList, b);
//                    s1 = booksList.get(i).findElement((By) dateField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) dateField).getText();
//                    DateFormat format = new SimpleDateFormat("MM/dd/yy hh:mm a", Locale.ENGLISH);
//                    date1 = format.parse(s1);
//                    date2 = format.parse(s2);
            }
//
//            if (date1 != null) {
//                result = date2.compareTo(date1);
//            } else result = myCollator.compare(s1, s2);
//            if (result >= 0) b = true;
//            else break;
        }
        return b;
    }

    public boolean checkNullBookOrder(String value) {
        boolean b = false;
        booksPerPageDropdownMenu.selectByValue("100");
        switch (value) {
            case "FirstName":
                endsWithNulls(firstAndSecondNameList, b);
//                for (int i = 0; i < titleList.size(); i++) {
//                    s = titleList.get(i).getText();
//                    s2 = titleList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "LastName":
                endsWithNulls(firstAndSecondNameList, b);
//                for (int i = 0; i < yearList.size(); i++) {
//                    s = yearList.get(i).getText();
//                    s2 = yearList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "DateOfBirth":
                endsWithNulls(dateOfBirthList, b);
//                for (int i = 0; i < authorList.size(); i++) {
//                    s = authorList.get(i).getText();
//                    s2 = authorList.get(i + 1).getText();
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

    public static boolean bookOrderByDate(List<WebElementFacade> lst, boolean b) throws ParseException {
        int result;
        String s1 = new String();
        String s2 = new String();
        Date date1 = new Date();
        Date date2 = new Date();
        for (int i = 1; i < lst.size(); i++) {
            s1 = lst.get(i).getText();
            s2 = lst.get(i - 1).getText();
            DateFormat format = new SimpleDateFormat("MM/dd/yy hh:mm a", Locale.ENGLISH);
            date1 = format.parse(s1);
            date2 = format.parse(s2);
            result = date2.compareTo(date1);
            if (result >= 0) b = true;
            else {
                b = false;
                break;
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
