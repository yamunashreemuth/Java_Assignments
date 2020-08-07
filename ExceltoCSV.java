package Package1;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;
import java.util.HashMap;
import java.util.*;
import org.apache.poi.*;
import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class ExceltoCSV {


	@SuppressWarnings("deprecation")
	public static void rdexcel(String file) throws IOException
	{
		try {
		FileInputStream fis=new FileInputStream(new File(file));  
		 CSVWriter writer = new CSVWriter(new FileWriter("G:\\Yamuna docs\\Test.csv"));
		HSSFWorkbook wb=new HSSFWorkbook(fis);   
		HSSFSheet sheet=wb.getSheetAt(0);  
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)      
		{  
		for(Cell cell: row)    
		{  
		switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
		{  
		case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
		System.out.print(cell.getNumericCellValue()+ "\t\t"); 
		double dline[] = {cell.getNumericCellValue()};
		//String ln[] = dline;
		//writer.writeAll((dline));
		break;  
		case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
		System.out.print(cell.getStringCellValue()+ "\t\t"); 
		String sline[] = {cell.getStringCellValue()};
		 writer.writeNext(sline);
		 writer.flush();
		break;  
		}  
		}  
		System.out.println();  
		}  }
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}

	
	public static void main(String[] args)  throws FileNotFoundException, IOException{
	
		rdexcel("G:\\Yamuna docs\\Product - Fix Wizard - Fixng Mode.xls");
	}



}
