package testutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileClass {
	
	static String data;
	
	public static String filedata(int row,int cell) throws IllegalStateException, IOException {
		
		String path="C:\\Users\\AdminPC\\eclipse-workspace\\bs.org\\src\\test\\resources\\File\\Book1.xlsx";
		FileInputStream file= new FileInputStream(path);
		Cell c= WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell);
		CellType type=c.getCellType();
		if (type.equals(CellType.STRING)) {
			
		    data= c.getStringCellValue();
		}
		else if (type.equals(CellType.NUMERIC)) {
			
			  double  s= c.getNumericCellValue();
		    data=Double.toString(s);
		    
		    
		   
		}
        else if (type.equals(CellType.BLANK)) {
			
		    System.out.println("No data Found");
		}
		
		
		return data;
		
	}

}
