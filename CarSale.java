package Package1;

import Package1.Car;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import com.opencsv.CSVWriter;

import java.io.*;

public class CarSale {

	private static Scanner sc = new Scanner(System.in);
	public static String carVIN;

	
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
            System.out.println("If you like to purchase car, please enter yes or no");
        }else {
            System.out.println("No Cars found.");
            }
        
    }
	
	public static void purchasecar(ArrayList<Car> cars) {
		
		String decision = "";
		decision = sc.next();
		if(decision.equals("yes")) {
			for (Car car : cars) {
				if(car.getcarVIN().equals(carVIN)) {
			 System.out.println("Congrats you purchased "+car.getcarmake());
			// System.out.println(car.getquantity());
			 int count = (car.getquantity())-1;
			System.out.println(count);
				
			
				}
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
			//break;
		case 2:
			System.out.println("Purchase car: ");
			
			//searchcar(cars);
			purchasecar(cars);
			break;
		case 3:
			break;
		default:
			break;
		}
			
		System.out.println();
		
	}
	
	
	
	public static void main(String[] args)throws IOException {
				
		ArrayList<Car> cars = new ArrayList<>();
        Car newCar = new Car("Mercedes", "SUV", "ADS23", "Black",36000, 5);
        cars.add(newCar);
        cars.add( new Car("Mercedes", "Sedan","EII33", "Red",22000,10));
		cars.add(new Car("Mercedes","Crossover", "CDL002", "Metallic Gray", 25000, 12));
        
      //  new FileOutputStream("G:\\Yamuna docs\\College docs\\AEM training\\myCars.txt", true).close();
        int menuOption = 0;
        enteroption();
       
        try {
        	 menuOption = sc.nextInt();
        	 System.out.println(menuOption);
        	 selectcar(menuOption, cars);
			while(menuOption != 3) 
	        {
	        		FileOutputStream fls = new FileOutputStream("G:\\Yamuna docs\\College docs\\AEM training\\myCars.txt");
	        		ObjectOutputStream objs = new ObjectOutputStream(fls);
	        		System.out.println("write text");
	        		for(Car carr : cars) {
	        			objs.writeObject(carr);
	        			System.out.println(carr);
	        		} 
	        		fls.close();
	        		
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        
        
	}

}
