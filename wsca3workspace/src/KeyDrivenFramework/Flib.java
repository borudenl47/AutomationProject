package KeyDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	
	
	public void readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		
		 FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		    Workbook wb = WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet("validdata");
		     Row row = sh.getRow(2);
		     Cell cell = row.getCell(1);
		    String data = cell.getStringCellValue();

	}
	
	
	
	
	
		
		public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			
			 FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
			    Workbook wb = WorkbookFactory.create(fis);
			   Sheet sh = wb.getSheet("validdata");
			     Row row = sh.getRow(2);
			     Cell cell = row.createCell(cellCount);
			     cell.setCellValue(data);
			    FileOutputStream fos = new FileOutputStream(excelpath);
			    wb.write(fos);
			    
	}

	
	
	
	
		public int getRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
		{
			
			 FileInputStream fis = new FileInputStream(excelpath);
			    Workbook wb = WorkbookFactory.create(fis);
			   Sheet sh = wb.getSheet(sheetName);
			   int rc = sh.getLastRowNum();
			  return rc;
			   
			     
			    
		
	}
	
		
		public String readPropertyData(String propPath,String key) throws EncryptedDocumentException, IOException
		{
			
			 FileInputStream fis = new FileInputStream(propPath);
			    Properties prop = new Properties();
			     prop.load(fis);
			    String value = prop.getProperty(key);
				return value;
	}
}
