package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream fle;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static String readExcel(int rowC,int colC) throws IOException {
		fle=new FileInputStream("C:\\SDET\\SeliniumAssesment\\Automation\\AssesmentAkash\\src\\test\\resources\\logincredentials.xlsx");
		workbook=new XSSFWorkbook(fle);
		sheet=workbook.getSheetAt(0);
		return readExcel(0,0);
			
	}

}
