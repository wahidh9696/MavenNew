package facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\src\\test\\resources\\Excel\\Data.xlsx");
		FileInputStream Fs=new FileInputStream(loc);
		
		XSSFWorkbook w = new XSSFWorkbook(Fs);
		
		Sheet sheet = w.getSheet("Data");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
			//	System.out.println(cellType);
				
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat sf=new SimpleDateFormat("2dd-MMM-yyyy");
						String value = sf.format(date);
						System.out.println(value);
					} else {
						double doubleNum = cell.getNumericCellValue();
						long ln=(long)doubleNum;
						String value = String.valueOf(ln);
						System.out.println(value);
					}

				}

			}
		}
		
	}

}
