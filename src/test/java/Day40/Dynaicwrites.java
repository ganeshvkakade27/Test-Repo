package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dynaicwrites {

	public static void main(String[] args) throws IOException {
	
FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\writedata.xlsx");  //open a file for write 
		
		XSSFWorkbook workbook=new XSSFWorkbook();//Create a workbook
		XSSFSheet sheet=workbook.createSheet("DynamicData");   //Create a Sheet
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnetr the Row Count:");
		int row=sc.nextInt();
		
		System.out.println("\nEnetr the Column count:");
		int col=sc.nextInt();
		
		for(int i=0;i<=row;i++)
		{
			XSSFRow curow=sheet.createRow(i);   //Create a new cell
			
			for(int j=0;j<col;j++)
			{
				
				XSSFCell cell=curow.createCell(j);
				cell.setCellValue(sc.next());   // enter the value and store in the cell
				
			}
			
		}
		
		workbook.write(file);  //attache workbook to file
		System.out.print("\nFile is sucessfully Created\n");
		
		workbook.close();
		file.close();
	
		
		
		
	}

}
