package KeyDrivenFrame;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib
{
	//Method To read the data
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); //declare excel path 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String celldata = cell.getStringCellValue();
		return celldata;

		//Note:-String wb = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowCount).getCell(cellCount).getStringCellValue();

	}
	//Method To write the data
	public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount,String Data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); //declare excel path 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(Data);

		FileOutputStream fos = new FileOutputStream(excelpath);	
		wb.write(fos);

	}
	//Method To get the used rowcount from excel
	public int getRowCountMethod(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath); //declare excel path 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowcount = sh.getLastRowNum();
		return rowcount;

	}
	//Method To read tha data from property data -mandatory and valid data
	public String readPropertyData(String propPath ,String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		//
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;

	}



}
