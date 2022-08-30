package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametarization {
	public static String getData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream  file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\AutoExel.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	    System.out.println(value);
	    return value;
	
	}
	
	public static double getNumericData(String sheetname, int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream  file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\AutoExel.xlsx");
		double value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	    System.out.println(value);
	    return value;
	
		
	}

}
