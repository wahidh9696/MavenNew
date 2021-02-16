package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\src\\test\\resources\\Excel\\Data.xlsx");
		
		FileInputStream st=new FileInputStream(loc);
	
		Workbook w=new XSSFWorkbook(st);
		
		Sheet sheet = w.getSheet("Data");
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		int cellCount = row.getPhysicalNumberOfCells();
		System.out.println(cellCount);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row r = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			
		}
		
		
		
	}

}
