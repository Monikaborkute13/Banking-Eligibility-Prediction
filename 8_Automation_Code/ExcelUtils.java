package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    public static String getCellData(String filePath, String sheetName, int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Row r = sheet.getRow(row);
        Cell c = r.getCell(col);
        String data = c.toString();
        workbook.close();
        return data;
    }
}
