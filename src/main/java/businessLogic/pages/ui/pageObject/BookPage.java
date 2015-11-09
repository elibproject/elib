package businessLogic.pages.ui.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.text.Collator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class BookPage extends PageObject {

    @FindBy(xpath = ".//*[@id='books']//sorting-directive")
    List<WebElementFacade> orderButtons;
    @FindBy(xpath = "//*[@id='books']//select")
    WebElementFacade booksPerPageDropdownMenu;
    @FindBy(xpath = "//*[@id='books']/div[1]//a")
    WebElementFacade addBookButton;
    @FindBy(xpath = "//*[@id='books']/div[3]/div/ul")
    List<WebElementFacade> booksList;
    @FindBy(xpath = ".//*[@id='books']/div[3]/div/ul//div//ul")
    List<WebElementFacade> authorList;
    @FindBy(xpath = ".//*[@id='books']/div[3]/div/ul//div//a/strong")
    List<WebElementFacade> titleList;
    @FindBy(xpath = ".//*[@id='books']/div[3]/div/ul//span[2]")
    List<WebElementFacade> yearList;
    @FindBy(xpath = ".//*[@id='books']/div[3]/div/ul//span[1]")
    List<WebElementFacade> publisherList;
    @FindBy(xpath = ".//*[@id='books']/div[3]/div/ul//span[4]")
    List<WebElementFacade> ratingList;
    @FindBy(xpath = ".//*[@id='books']/div[3]/div/ul//span[6]")
    List<WebElementFacade> dateList;
    @FindBy(xpath = ".//*[@id='books']//sorting-directive/ul//span[@class='glyphicon noselect glyphicon-triangle-bottom']")
    List<WebElementFacade> arrowList;
    @FindBy(xpath = ".//*[@id='books']//a/strong")
    WebElementFacade titleField;
    @FindBy(xpath = ".//*[@id='books']//ul//div[2]/span[2]")
    WebElementFacade yearField;
    @FindBy(xpath = ".//*[@id='books']//ul//ul")
    WebElementFacade authorField;
    @FindBy(xpath = ".//*[@id='books']/div[3]//ul//span[1]")
    WebElementFacade publisherField;
    @FindBy(xpath = ".//*[@id='books']/div[3]//ul//span[4]")
    WebElementFacade ratingField;
    @FindBy(xpath = ".//*[@id='books']//ul//div//span[6]")
    WebElementFacade dateField;

    public void orderByValue(String value) {
        switch (value) {
            case "Title":
                orderButtons.get(0).click();
            case "Year":
                orderButtons.get(1).click();
            case "Authors":
                orderButtons.get(2).click();
            case "Publishers":
                orderButtons.get(3).click();
            case "Rating":
                orderButtons.get(4).click();
            case "Date":
                orderButtons.get(5).click();
        }
    }

    public boolean checkPresenceOfArrow(String value) {
        boolean presence = false;
        switch (value) {
            case "Title":
                presence = arrowList.get(0).isPresent();
            case "Year":
                presence = arrowList.get(1).isPresent();
            case "Authors":
                presence = arrowList.get(2).isPresent();
            case "Publishers":
                presence = arrowList.get(3).isPresent();
            case "Rating":
                presence = arrowList.get(4).isPresent();
            case "Date":
                presence = arrowList.get(5).isPresent();
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
        for (int i = 1; i < booksList.size(); i++) {
            switch (value) {
                case "Authors":
                    bookOrderForAuthor(stringConvert(authorList), b);
//                    s1 = booksList.get(i).findElement((By) titleField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) titleField).getText();
                case "Year":
                    bookOrder(yearList, b);
//                    s1 = booksList.get(i).findElement((By) yearField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) yearField).getText();
                case "Title":
                    bookOrder(authorList, b);
//                    s1 = booksList.get(i).findElement((By) authorField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) authorField).getText();
                case "Publishers":
                    bookOrder(publisherList, b);
//                    s1 = booksList.get(i).findElement((By) publisherField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) publisherField).getText();
                case "Rating":
                    bookOrder(ratingList, b);
//                    s1 = booksList.get(i).findElement((By) ratingField).getText();
//                    s2 = booksList.get(i - 1).findElement((By) ratingField).getText();
                case "Date":
                    bookOrderByDate(dateList, b);
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
            case "Title":
                endsWithNulls(titleList, b);
//                for (int i = 0; i < titleList.size(); i++) {
//                    s = titleList.get(i).getText();
//                    s2 = titleList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "Year":
                endsWithNulls(yearList, b);
//                for (int i = 0; i < yearList.size(); i++) {
//                    s = yearList.get(i).getText();
//                    s2 = yearList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "Authors":
                endsWithNulls(authorList, b);
//                for (int i = 0; i < authorList.size(); i++) {
//                    s = authorList.get(i).getText();
//                    s2 = authorList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "Publishers":
                endsWithNulls(publisherList, b);
//                for (int i = 0; i < publisherList.size(); i++) {
//                    s = publisherList.get(i).getText();
//                    s2 = publisherList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "Rating":
                endsWithNulls(ratingList, b);
//                for (int i = 0; i < ratingList.size(); i++) {
//                    s = ratingList.get(i).getText();
//                    s2 = ratingList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
            case "Date":
                endsWithNulls(dateList, b);
//                for (int i = 0; i < dateList.size(); i++) {
//                    s = dateList.get(i).getText();
//                    s2 = dateList.get(i + 1).getText();
//                    if ((s.isEmpty()) && !s2.isEmpty()) {
//                        b = false;
//                    }
//                }
//        }
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

    public static boolean bookOrder(List<WebElementFacade> lst, boolean b) {
        Collator myCollator = Collator.getInstance();
        int result;
        String s1 = new String();
        String s2 = new String();
        for (int i = 1; i < lst.size(); i++) {
            s1 = lst.get(i).getText();
            s2 = lst.get(i - 1).getText();
            result = myCollator.compare(s1, s2);
            if (result >= 0) b = true;
            else {
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean bookOrderForAuthor(List<String> lst, boolean b) {
        Collator myCollator = Collator.getInstance();
        int result;
        String s1 = new String();
        String s2 = new String();
        for (int i = 1; i < lst.size(); i++) {
            s1 = lst.get(i);
            s2 = lst.get(i - 1);
            result = myCollator.compare(s1, s2);
            if (result >= 0) b = true;
            else {
                b = false;
                break;
            }
        }
        return b;
    }

    public static List<String> stringConvert(List<WebElementFacade> lst) {
        String s1;
        String s2;
        List<String> lst1 = new ArrayList<String>();
        int a;
        for (int i = 0; i < lst.size(); i++) {
            s1 = lst.get(i).getText();
            a = s1.indexOf(" ");
            s2 = s1.substring(a + 1);
            lst1.add(i, s2);
        }
        return lst1;
    }
}