package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		 
		//open/Enter the wordbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		//get sheet
	    XSSFSheet sheet = wb.getSheet("sheet1");
	    //get row
	    

	}

}
