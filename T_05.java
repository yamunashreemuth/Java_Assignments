package practise;

public class T_05 {
	int num1;
	int num2;
	int num3;
	
	public int sumOfMultiples(int a, int b, int c) {
		this.num1 = a;
		this.num2 = b;
		this.num3 = c;
		int rem;
		rem = a%10;
		a = a+(10-rem);
		int rem1; 
		rem1 = b%10;
		b = b+(10-rem1);
		int rem2 = c%10;
		c = c+(10-rem2);
		if(a<=0||b<=0||c<=0) {
			int output = -1;
			System.out.println(output);
			
		}
		else {
			int res;
			res = a+b+c;
			System.out.println("sum of all three rounded values: "+res);
			
		}return a;
	}
	

	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 54;
		int n3 = 91;
		
		T_05 aSum = new T_05();
		aSum.sumOfMultiples(n1, n2, n3);

	}

}
