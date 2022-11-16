package readExceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
   Sheet sh = wb.getSheet("validdata");
     Row row = sh.getRow(2);
     Cell cell = row.getCell(1);
    String data = cell.getStringCellValue();
    
   System.out.println(data);
     
		
	}

}
