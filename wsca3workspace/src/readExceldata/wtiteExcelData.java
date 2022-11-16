package readExceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class wtiteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet("validdata");
	     Row row = sh.getRow(1);
	     Cell cell = row.getCell(2);
	     cell.setCellValue("Nilam");
	  FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
	    wb.write(fos);
	    
	}	   
}
