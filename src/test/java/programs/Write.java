package programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\src\\test\\resources\\Excel\\Write.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet();
		Row createRow = createSheet.createRow(1);
		Cell createCell = createRow.createCell(1);
		createCell.setCellValue("Wahidh");
		System.out.println(createCell);
		
		FileOutputStream os=new FileOutputStream(loc);
		w.write(os);
	
	}

}
