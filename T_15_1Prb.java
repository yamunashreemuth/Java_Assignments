package practise;
import java.util.*;

public class T_15_1Prb {
	
	public int sumOfMultiples(int a, int b, int c) {

		int rem;
		rem = a%10;
		if(a%10 == 0) {
			a = a;
		} else {
		a = a+(10-rem);
		}
		int rem1; 
		rem1 = b%10;
		if(b%10 == 0) {
			b = b;
		} else {
			b = b+(10-rem1);
		}
		
		int rem2 = c%10;
		if(c%10 == 0) {
			c = c;
		} else {
			c = c+(10-rem2);
		}
		
		if(a<=0||b<=0||c<=0) {
			int output = -1;
			System.out.println(output);
			
		}
		else {
			int res;
			res = a+b+c;
			System.out.println("sum of all three rounded values: "+res);
			
		}return a + b + c;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		T_15_1Prb aSum = new T_15_1Prb();
		aSum.sumOfMultiples(n1,n2,n3);

	}

}
