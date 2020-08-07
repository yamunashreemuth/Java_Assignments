package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class Car implements Serializable  {
	
	static String carmake;
	String cartype;
	String carVIN;
	String carcolor;
	int carprice;
	int quantity;
	
	Car(String carmake,	String cartype,	String carVIN,	String carcolor,int carprice, int quantity){
		this.carmake = carmake;
		this.cartype = cartype;
		this.carVIN = carVIN;
		this.carcolor = carcolor;
		this.carprice = carprice;
		this.quantity = quantity;
	}
	public String getcarVIN() {
		
		return carVIN;
	}
	public String getcarmake() {
		return carmake;
	}
	public String getcartype() {
		return cartype;
	}
	public String getcarcolor() {
		return carcolor;
	}
	public int getcarprice() {
		return carprice;
	}
	public int getquantity() {
		return quantity;
	}
	
	
	
	
	}


