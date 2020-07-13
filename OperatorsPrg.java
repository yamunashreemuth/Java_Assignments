package practise;

public class OperatorsPrg {

	public static void main(String[] args) {
		int a = 50;
		double b = 103; 
		float res = (a += b);
		byte c1 = 5;
		byte c2 = 5;
		System.out.println("Addition assignment: " + res);
		System.out.println("Subtraction assignment: " + (b -= a));
		System.out.println("Multiplication assignment: " +( b *= a));
		System.out.println("Division assignment: " +(b/=a));
		System.out.println("Modulo assignment: " +(a %= b));
		System.out.println("Auto-increment: "+ (a++));
		System.out.println("Auto-decrement: "+ (--b));
		if(a!= b)
		{
		System.out.println("!= Relational is true" );
		}
		if(a>b)
		{
			System.out.println("> relational is true");
		}
		if(b <a)
		{
			System.out.println("< relational is true");
		}
		if(c1 == c2)
		{
			System.out.println("== relational is true");
		}
		 if(c1 == c2 && b <= a)
		{
			System.out.println("Logical && is true");
		}
		  if(c1 == c2 || b >= a)
		 {
			 System.out.println("Logical || is true"); 
		 }
		  else
		  {
			  System.out.println("Nothing is true");
		  }
		long ternary;
		long t1 = 150l;
		long t2 = 12000l;
		ternary = t2 > t1 ? t2 : t1;
		System.out.println("Ternary o/p " + ternary); 
		 
	}

}
