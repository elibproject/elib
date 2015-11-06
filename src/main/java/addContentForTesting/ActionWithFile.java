package addContentForTesting;


import jxl.read.biff.BiffException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActionWithFile {
    static final String FILE_PATH = "C:\\Users\\Iryna_Koryttseva\\IdeaProjects\\elib\\src\\main\\resources" +
            "\\listTestText.xls";

    public static void main(String[] args) throws BiffException, IOException {

        // ActionWithFile actionWithFile = new ActionWithFile();
        // actionWithFile.readExcelFile();
        // actionWithFile.writeExcelDataInListComments();
        //List commentsTestData = readExcelFileComments();
        //System.out.print(commentsTestData);
    }


    private static void readExcelFileComments() throws IOException {

        List testData = new ArrayList();
        FileInputStream com = null;
        try {
            com = new FileInputStream(FILE_PATH);
            HSSFWorkbook wbComments = new HSSFWorkbook(com);
            int numberOfSheets = wbComments.getNumberOfSheets();
            //looping over each workbook sheet
            for (int i = 0; i < numberOfSheets; i++) {
                HSSFSheet sheet = wbComments.getSheetAt(i);
                Iterator rowIterator = sheet.iterator();
                //iterating over each row
                while (rowIterator.hasNext()) {
                    Content content = new Content();
                    Row row = (Row) rowIterator.next();
                    Iterator cellIterator = row.cellIterator();
                    //Iterating over each cell (column wise)  in a particular row.
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        //The Cell Containing String will is name.
                        if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                            content.setComments(cell.getStringCellValue());
                            //The Cell Containing numeric value will contain marks
                        } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                            //Cell with index 1 contains marks in Maths
                            if (cell.getColumnIndex() == 1) {
                                content.setAuthors(String.valueOf(cell.getNumericCellValue()));
                            }
                            //Cell with index 2 contains marks in Science
                            else if (cell.getColumnIndex() == 2) {
                                content.setPublishers(String.valueOf(cell.getNumericCellValue()));
                            }
                            //Cell with index 3 contains marks in English
                            else if (cell.getColumnIndex() == 3) {
                                content.setTitlebook(String.valueOf(cell.getNumericCellValue()));
                            }

                        }

                    }

                    //end iterating a row, add all the elements of a row in list

                    testDataList.add(testData);

                }

            }

            com.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

  /*  public void readExcelFile() throws BiffException, IOException {

        FileInputStream text = new FileInputStream(FILE_PATH);
        Workbook wb = Workbook.getWorkbook(text);
        // TO get the access to the sheet
        Sheet shCom = wb.getSheet("comments");
        Sheet shPub = wb.getSheet("publishers");
        Sheet shAut = wb.getSheet("authors");
        Sheet shBook = wb.getSheet("books");
        // To get the number of rows present in sheet
        int totalNoOfRows = shCom.getRows();
        int totalNoOfRowsPub = shPub.getRows();
        int totalNoOfRowsAut = shAut.getRows();
        int totalNoOfRowsBook = shBook.getRows();
        // To get the number of columns present in sheet
        int totalNoOfCols = shCom.getColumns();
        for (int row = 0; row < totalNoOfRows; row++) {
            for (int col = 0; col < totalNoOfCols; col++) {
                System.out.print(shCom.getCell(col, row).getContents());
            }
            System.out.println();
        }
        int totalNoOfColsPub = shPub.getColumns();
        for (int row = 0; row < totalNoOfRowsPub; row++) {
            for (int col = 0; col < totalNoOfColsPub; col++) {
                System.out.print(shPub.getCell(col, row).getContents());
            }
            System.out.println();
        }
        int totalNoOfColsAut = shAut.getColumns();
        for (int row = 0; row < totalNoOfRowsAut; row++) {
            for (int col = 0; col < totalNoOfColsAut; col++) {
                System.out.print(shAut.getCell(col, row).getContents());
            }
            System.out.println();
        }
        int totalNoOfColsBook = shBook.getColumns();
        for (int row = 0; row < totalNoOfRowsBook; row++) {
            for (int col = 0; col < totalNoOfColsBook; col++) {
                System.out.print(shBook.getCell(col, row).getContents());
            }
            System.out.println();
        }
    }*/




