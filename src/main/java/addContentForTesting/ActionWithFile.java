package addContentForTesting;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.ss.extractor.ExcelExtractor;

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
        ExcelExtractor extractor = new ExcelExtractor(wb)
        extractor.setFormulasNotResults(false); // Считать формулы
        extractor.setIncludeSheetNames(true);
        String[] text = extractor.getText();
        System.out.println(text);
        {
            // @Override
            //  public String getText() {
            //      return null;
            //    }

        }



    }

/*public class ActionWithFile {

    public static void readExcelFile(String File)throws IOException {
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream("C:/Users/Iryna_Koryttseva/IdeaProjects/elib/src/main/resources/listTestText.xls"));
        HSSFSheet myExcelSheet = myExcelBook.getSheet("Birthdays");
        HSSFRow row = myExcelSheet.getRow(0);

        if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String name = row.getCell(0).getStringCellValue();
            System.out.println("name : " + name);
        }

        if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
            Date birthdate = row.getCell(1).getDateCellValue();
            System.out.println("birthdate :" + birthdate);
        }

        myExcelBook.close();
    }*/
//}*/



