package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingdataExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\writedata.xlsx");  //open a file for write 
		
		XSSFWorkbook workbook=new XSSFWorkbook();//Create a workbook
		XSSFSheet sheet=workbook.createSheet("Data");   //Create a Sheet
		
		XSSFRow row1=sheet.createRow(0);   //Created row
		
		row1.createCell(0).setCellValue("Firstname");
		row1.createCell(1).setCellValue("Lastname");
		row1.createCell(2).setCellValue("Email");
		row1.createCell(3).setCellValue("Location");
		
XSSFRow row2=sheet.createRow(1);   //Created row
		
		row2.createCell(0).setCellValue("Ganesh");
		row2.createCell(1).setCellValue("Kakade");
		row2.createCell(2).setCellValue("gvkakade@gmail.com");
		row2.createCell(3).setCellValue("Pune");
		
XSSFRow row3=sheet.createRow(2);   //Created row
		
		row3.createCell(0).setCellValue("Pihu");
		row3.createCell(1).setCellValue("Kakade");
		row3.createCell(2).setCellValue("Pihu@gmail.com");
		row3.createCell(3).setCellValue("Baramati");
		
		workbook.write(file);
		System.out.print("\nFile is Created\n");
		
		workbook.close();
		file.close();
		
	}

}
