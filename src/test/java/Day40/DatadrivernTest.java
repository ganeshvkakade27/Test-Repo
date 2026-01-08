package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivernTest {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\UsersTestData.xlsx");

			XSSFWorkbook workbook=new XSSFWorkbook(file);    // File contains workbook of excel file
			
			XSSFSheet sheet=workbook.getSheet("data");     //get Sheet from Workbook   and store into varibale
			
	//		XSSFSheet sheet=workbook.getSheetAt(0);    provide the index of sheet, but more file its show problem
			
			int row=sheet.getLastRowNum();   //used to get the row count
			
			int cell=sheet.getRow(0).getLastCellNum();   //used to get the column count
	
			System.out.println("Total number of Rows:"+row);
			System.out.println("Total number of Cells:"+cell);
		
			for(int i=0;i<=row;i++)
			{
				//to Get Row
				
				XSSFRow xssfrow=sheet.getRow(i);  //to get entire row
				
				for(int j=0;j<cell;j++)
				{
					XSSFCell celldata=xssfrow.getCell(j);   //return the cell data row 
					
					System.out.print(celldata.toString()+"\t");
				}
			System.out.println("");
			}
			
			workbook.close();
			file.close();
			
		
	}
	

}
