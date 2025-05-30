package vivek.qa.Utilitis;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import vivek.qa.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil extends BaseClass {

    private static Workbook workbook;
    private static Sheet sheet;

    public static void loadExcel(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
    }

    public static String getCellData(int rowNum, int colNum) {
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        DataFormatter formatter = new DataFormatter(); // handles numeric & string
        return formatter.formatCellValue(cell);
    }

    public static int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public static void close() throws IOException {
        workbook.close();
    }
}

