package Package1;

import Package1.Car;
import Package1.CarSale;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Tst {
	private static Scanner sc = new Scanner(System.in);

	public static void xlslist(List xldata) {
		
		for (int i = 0; i < xldata.size(); i++) { 
            List list = (List) xldata.get(i); 
          //  FormulaEvaluator formulaEvaluator=((Workbook) list).getCreationHelper().createFormulaEvaluator();  
            for (int j = 0; j < list.size(); j++) { 
                HSSFCell cell = (HSSFCell) list.get(j); 
                System.out.print(cell.getStringCellValue());
               // HSSFCell cell1 = (HSSFCell) list.get(j); 
                //System.out.print(cell.getNumericCellValue()); 
                if (j < list.size() - 1) { 
                    System.out.print(", "); 
                } 
            } 
            System.out.println(""); 
        } 
    } 
	
	
	
	private static void displayCars(ArrayList<Car> cars)throws Exception {
		String formatter = "|%-2s| %-2s | %-6s | %-5s | %-5s | %-5d | %-8d |%n";
	        System.out.printf("| #  | Car Make | Car Model | Car VIN  | Car color  | Car Price | Car quantity |%n");
	        int i = 0;
	        for (Car car : cars) {
	            System.out.format(formatter,++i,car.getcarmake(),car.getcartype(),car.getcarVIN(),car.getcarcolor(),car.getcarprice(), car.getquantity());
	        }
	    
		}
		public static void displayCars(Car car) throws Exception {
	        String formatter = "|%-2s| %-2s | %-6s | %-5s | %-5s | %-5d | %-8d |%n";
	        System.out.printf("| #  | Car Make | Car Model | Car VIN | Car color  | Car Price | Car quantity |%n");
	        System.out.format(formatter,1,car.getcarmake(),car.getcartype(),car.getcarVIN(),car.getcarcolor(),car.getcarprice(), car.getquantity());
	    }
		
	
	public static void searchcar(ArrayList<Car> cars) throws Exception {
		String carVIN;
		Car carfound = null;
		do {
			System.out.println("Enter car VIN no: ");
			carVIN = sc.next();
			
		}while(!carVIN.matches("^[a-zA-Z0-9]{3,15}$"));
		for (Car car : cars) {
            if(car.getcarVIN().equals(carVIN))
            {
                carfound = car;
            }    
        }
        if(carfound != null) {
            displayCars(carfound);
        }else {
            System.out.println("No Cars found.");
            }
        System.out.println("If you like to purchase car, please enter yes or no");
    }
	
	public static void purchasecar(ArrayList<Car> cars) {
		
		String decision = "";
		decision = sc.next();
		if(decision.equals("yes")) {
			for (Car car : cars) {
			 System.out.println("Congrats you purchased "+car.getcarmake());
			 
		}
	}else {
		System.out.println("Thank you for your interest");
	}
		
		}
	
	public static void enteroption() {
		System.out.println("Please select the option for car menu: ");
		System.out.println("0 - available car list");
		System.out.println("1 - search car availiability");
		System.out.println("2 - purchase car");
		System.out.println("3 - Exit");
		
	}
	public static void selectcar(int menu, ArrayList<Car> cars) throws Exception {
		switch(menu) {
		case 0: 
			System.out.println("Available Car list: ");
			displayCars(cars);
			searchcar(cars);
			purchasecar(cars);
			break;
		case 1:
			System.out.println("Search car list: ");
			searchcar(cars);
			purchasecar(cars);
			break;
		case 2:
			System.out.println("Purchase car: ");
			purchasecar(cars);
			break;
		case 3:
			break;
		default:
			break;
		}
			
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException{
		String xlfile ="G:\\Yamuna docs\\College docs\\AEM training\\CarSale.xls";
		List xldata = new ArrayList();
		FileInputStream xlsip = null;
		try {
		xlsip = new FileInputStream(xlfile);
		HSSFWorkbook workbook = new HSSFWorkbook(xlsip); 
		HSSFSheet sheet = workbook.getSheetAt(0); 
		Iterator rows = sheet.rowIterator(); 
        while (rows.hasNext()) { 
            HSSFRow row = (HSSFRow) rows.next(); 
            Iterator cells = row.cellIterator(); 

            List data = new ArrayList(); 
            while (cells.hasNext()) { 
                HSSFCell cell = (HSSFCell) cells.next(); 
                data.add(cell); 
            } 

            xldata.add(data); 
        } } 
		catch (IOException e) { 
            e.printStackTrace(); 
        } 
		xlslist(xldata);
		ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(xldata);
        System.out.println(cars);
        
        new FileOutputStream("G:\\Yamuna docs\\College docs\\AEM training\\myCars.txt", true).close();
        int menuOption = 0;
        enteroption();
        menuOption = sc.nextInt();
        try {
        	selectcar(menuOption, cars);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        while(menuOption != 3) ;
        {
        		FileOutputStream fls = new FileOutputStream("G:\\Yamuna docs\\College docs\\AEM training\\myCars.txt");
        		ObjectOutputStream objs = new ObjectOutputStream(fls);
        		for(Car car : cars) {
        			objs.writeObject(car);
        		} fls.close();
	}
	}
}



