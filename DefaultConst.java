package practise;

public class DefaultConst {
	
	//default constuctor 
	int num1;
	int num2;
	float res ;
	
	//No argument constructor
	public DefaultConst()
	{
		float number1 = 9;
		float number2 = 6;
		res = number1 * number2;
		System.out.println("multiple func " + res);
	}

	//Parameterized Constructor
	public DefaultConst(double d, double d1)
	{
		double mod = d % d1;
		System.out.println(mod);
	}
}
