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
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datas {

	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\src\\test\\resources\\Excel\\Datas.xlsx");
		
		FileInputStream is=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(is);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells() ; j++) {
					Cell cell = row.getCell(j);
					
				int type = cell.getCellType();
					
				if (type==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyy");
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