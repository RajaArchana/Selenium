package Assignment3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getRead() throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book = new XSSFWorkbook("./Data/CreateLead.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int coloumnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(coloumnCount);
		String[][] data = new String[rowCount][coloumnCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < coloumnCount; j++) {
				String text = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = text;
			}

		}
		book.close();
		return data;

	}

}
