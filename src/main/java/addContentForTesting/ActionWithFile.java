package addContentForTesting;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.IOException;
public class ActionWithFile {

    public static void main(String[] args) throws BiffException, IOException {

        ActionWithFile actionWithFile = new ActionWithFile();
        actionWithFile.readExcelFile();

    }


    public void readExcelFile() throws BiffException, IOException {
        String comments = "C:\\Users\\Iryna_Koryttseva\\IdeaProjects\\elib\\src\\main\\resources\\listTestText.xls";
        FileInputStream text = new FileInputStream(comments);
        Workbook wb = Workbook.getWorkbook(text);
        // TO get the access to the sheet
        Sheet sh = wb.getSheet("comments");
        //Sheet sh = wb.getSheet("authors");
        // Sheet sh = wb.getSheet("publishers");
        // Sheet sh = wb.getSheet("books");
        // To get the number of rows present in sheet
        int totalNoOfRows = sh.getRows();
        // To get the number of columns present in sheet
        int totalNoOfCols = sh.getColumns();
        for (int row = 0; row < totalNoOfRows; row++) {
            for (int col = 0; col < totalNoOfCols; col++) {
                System.out.print(sh.getCell(col, row).getContents() + "\t");
            }
            System.out.println();
        }
    }
}


