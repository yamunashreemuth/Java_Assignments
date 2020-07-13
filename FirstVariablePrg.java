package practise;

public class FirstVariablePrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		float num2 = 9.2f;
		double res;
		char c = 'a';
		char a = 37;
		byte num = 8;
		short s = 65;
		long l = num * s;
		boolean r = true;
		res = num1 % num2;
		System.out.println("int, float, double variables used: " + res);
		System.out.println("type casting char to int: "+(int)c);
		System.out.println("Character variable: " + a);
		System.out.println("byte & short variables use: " + (num - s));
		System.out.println("variable type long: " + l);
		if(r == true)
		{
		System.out.println("boolean variable: "+r);
		}
	}

}
