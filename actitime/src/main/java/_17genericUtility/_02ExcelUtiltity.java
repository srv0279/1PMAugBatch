package _17genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _02ExcelUtiltity {

	public String fetchDataFromExcelSheet(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1 = new FileInputStream("./src/test/resources/excelData1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis1);
		return workbook.getSheet("sheet2").getRow(1).getCell(0).toString();
	}
}
