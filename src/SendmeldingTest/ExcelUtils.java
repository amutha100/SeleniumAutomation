package SendmeldingTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;	 
	private static XSSFRow Row;

	//Set excel file
	public static void setExcelFile() throws Exception  {
		
		try {
			FileInputStream ExcelFile = new FileInputStream(Constant.Path_Data + Constant.File_Data);
			
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			
			ExcelWSheet = ExcelWBook.getSheet(Constant.Sheet_Name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.info("SetEcxel OK");
		
	}
	
	//Get cell data
	public static String getCellData(int rownum, int colnum) {
		
		Cell = ExcelWSheet.getRow(rownum).getCell(colnum);
		String Celldata = Cell.getStringCellValue();
		//System.out.println(Celldata);
		Log.info("Getdata OK");
		return Celldata;
	}
	
	//Write cell data
	public static void writeCellData(String result, int rownum, int colnum) throws Exception {
		
		Row  = ExcelWSheet.getRow(rownum);
		Cell = Row.getCell(colnum);
		if (Cell == null) {
			 
			Cell = Row.createCell(colnum);

			Cell.setCellValue(result);

			} else {

				Cell.setCellValue(result);

			}
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_Data + Constant.File_Data);
		 
			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();
			Log.info("Write Data OK");
	}
	
}
