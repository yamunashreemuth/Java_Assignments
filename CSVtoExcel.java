package Package1;

import java.io.*;

public class CSVtoExcel {
	
	public static final String delimit = ",";
	
	public static void csvread(String csvfile) {
		try {
			File cfile = new File(csvfile);
			FileReader cfr = new FileReader(csvfile);
			BufferedReader cbf = new BufferedReader(cfr);
			String rd = "";
			String[] temp;
			while((rd = cbf.readLine())!= null) {
				temp = rd.split(delimit);
				for(String str : temp) {
					System.out.println(str);
				} System.out.println();
			}
			cbf.close();
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		String csv = "G:\\Yamuna docs\\College docs\\Info Ret\\kdata.csv"; //CrimeRate
		CSVtoExcel.csvread(csv);
	}

}
