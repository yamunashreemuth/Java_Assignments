package practise;

public class T_04 {
	
	int dayOfWeek;
	boolean vacation;
	
	public String ringAlarm(int day, boolean vac) {
		this.dayOfWeek = day;
		this.vacation = vac;
		String value;
		if((0 > day) && (day <= 6) && vac == true ) {		
		value = "invalid inputs";
		System.out.println(value);
		return value;
		}
		if(day > 1 && day <= 5 &&  vac == true) {		
			value = "week day's & vacation true: 10:00";
			System.out.println(value);
			return value;
			}
		if(day > 1 && day <= 5 && vac == false ) {		
			value = "week day's and vcation false: 07:00";
			System.out.println(value);
			return value;
			}
		if(day == 0 || day== 6 && vac == true) {		
			value = "OFF";
			System.out.println(value);
			return value;
			}
		if(day == 0 || day== 6 && vac == false) {		
			value = "weekend's 10:00";
			System.out.println(value);
			return value;
			}
		return "Not a valid day";
	}

	public static void main(String[] args) {

		int no = 6;
		boolean val = false;
		T_04 aPrintDay = new T_04();
		aPrintDay.ringAlarm(no, val);

	}

}
