package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib
{
	//Method To read the data from excel
	public String readExcelData(String ExcelPath,String SheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		// FileInputStream() method use to read the data by passing file path
		FileInputStream fis = new FileInputStream(ExcelPath);//Excelpath-pass the file path of exceldata(testdata.xlsx)

		// WorkBookFactory is class which has present all method to read and write data
		// create() method is use to getting ready the specified file withich declare in FIS
		Workbook wb = WorkbookFactory.create(fis);

		//getSheet() method used to select the sheet from Excel File
		Sheet sh = wb.getSheet(SheetName);

		//getRow() method used to select row from the selected sheet of excel file
		Row row = sh.getRow(rowCount);

		//getCell() method used to select cell from the selected sheet of excel file
		Cell cell = row.getCell(cellCount);

		//getStringCellValue() method used to read the data from cell 
		String celldata = cell.getStringCellValue();

		//return data -used to return cell value in output
		return celldata;
	}

	//Method To write the data in excel
	//Step1-1st we have to read the data from sheet 
	//step2-write the data in selected cell
	public void writeExcelData(String ExcelPath,String SheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		// FileInputStream() method use to read the data by passing file path
		FileInputStream fis = new FileInputStream(ExcelPath);//Excelpath-pass the file path of exceldata(testdata.xlsx)

		// WorkBookFactory is class which has present all method to read and write data
		// create() method is use to getting ready the specified file withich declare in FIS
		Workbook wb = WorkbookFactory.create(fis);

		//getSheet() method used to select the sheet from Excel File
		Sheet sh = wb.getSheet(SheetName);

		//getRow() method used to select row from the selected sheet of excel file
		Row row = sh.getRow(rowCount);

		//createCell() method used to select cell from sheet and clear the present data from cell
		Cell cell = row.createCell(cellCount);

		//FileOutputStream()-use to write the data 	
		FileOutputStream fos = new FileOutputStream(ExcelPath);

		//setCellValue() method used to wite the data in selected cell
		cell.setCellValue(data);
		//write the data into given path of excel which store in 'fos' ref variable
		wb.write(fos);

		//Note:- no need to return data becuse we write the data in selected sheet
	}

	//get the used row count from excel-used to login with invalid scenario
	public int getRowCountMethod(String ExcelPath,String SheetName ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int rowcount = sh.getLastRowNum();
		return rowcount;

	}

}
