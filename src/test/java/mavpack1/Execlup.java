package mavpack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class Execlup {

			public static String excelupload(String xl,String sh,int r,int c) throws Exception
			
			{
				
				FileInputStream f=new FileInputStream(xl);
				XSSFWorkbook wb=new XSSFWorkbook(f);
			 XSSFCell cell=wb.getSheet(sh).getRow(r).getCell(c);
			 if (cell.getCellType()==CellType.STRING)
			 {
				 return cell.getStringCellValue();
			 }
			 else
			 {
				 double v=cell.getNumericCellValue();
				 int va=(int)v;
				 return String.valueOf(va);
			 }
			}
			
		public static int rowval(String xl,String sh) 
		{
			try {
			FileInputStream f=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet sheet=wb.getSheet(sh);
			int r=sheet.getLastRowNum();
			
		return r;}
			catch(Exception e)
			{return 0;}
		}


		}



