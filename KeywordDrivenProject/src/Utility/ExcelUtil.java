package Utility;


import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	private static XSSFSheet excelSheet;
	private static XSSFWorkbook excelWorkbook;
	private static XSSFCell excelCell;

	public static void setExcelData(String path, String sheetName)
			throws Exception {

		try{
			FileInputStream ExcelFile = new FileInputStream(path);
			excelWorkbook= new XSSFWorkbook(ExcelFile);
			excelSheet = excelWorkbook.getSheet(sheetName);
			}catch(Exception e){
				throw(e);
			}
		
	}

	public static String getCellData(int rowNum, int colNum) throws Exception {

		excelCell = excelSheet.getRow(rowNum).getCell(colNum);
		String cellData= excelCell.getStringCellValue();
		return cellData;

	}

}
