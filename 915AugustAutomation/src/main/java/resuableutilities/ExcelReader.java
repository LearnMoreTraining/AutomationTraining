package resuableutilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelReader
{

    public String readExcel(String sheetName, int row , int column)  {
        String data= null;
        String excelPath = System.getProperty("user.dir");
        File filePath = new File(excelPath+"/src/main/resources/datasheet/Salesforce.xlsx");
        try {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        data=sheet.getRow(row).getCell(column).getStringCellValue();

        }

        catch (Exception e){
            System.out.println(e);
        }
        return data;
    }
}
