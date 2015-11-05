package addContentForTesting;


public class ActionWithFile {

    public static void main(String[] args) throws Exception {
        String comments = "C:/Users/Iryna_Koryttseva/IdeaProjects/elib/src/main/resources/listComments.xls";
        String authors = "C:/Users/Iryna_Koryttseva/IdeaProjects/elib/src/main/resources/listAuthors.xls";
        System.out.println("You can choose the one word, what the test content need to add, input word: comments, authors,publishers, books");

    }

   /* public static void main(String[] args) throws Exception {
        InputStream contentTest = new FileInputStream("C:/Users/Iryna_Koryttseva/IdeaProjects/elib/src/main/resources/listComments.xls");
        HSSFWorkbook wb = new HSSFWorkbook(contentTest);
       // ExcelExtractor extractor = new ExcelExtractor(wb);

        extractor.setFormulasNotResults(false); // Считать формулы
        extractor.setIncludeSheetNames(true);
        String text = extractor.getText();

        System.out.println(text);

    }
}
public class ActionWithFile {

    public static void readExcelFile(String File)throws IOException {
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream("C:/Users/Iryna_Koryttseva/IdeaProjects/elib/src/main/resources/listComments.xls"));
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
}



