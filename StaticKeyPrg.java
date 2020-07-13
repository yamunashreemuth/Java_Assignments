package practise;

class Calc
{
	int n1;
	int n2;
	double res;
	static String word; //static keyword
	
	//static block
	static 
	{
		word = "This is static keyword";
		System.out.println(word);
	}
	
	protected void add(int i, int j) {
		int res;
		res = i + j;
		System.out.println("protected modifier check " + res);
	}
	
	private void display()
	{
		System.out.println("This is Private modifier");
	}
	
	void disp()
	{
		System.out.println("This is default modifier");
	}
}


public class StaticKeyPrg {
	
	public void show()
	{
		System.out.println("This is Public access modifier");
	}
	public static void main(String[] args) {
		
		Calc var = new Calc();
		StaticKeyPrg obj = new StaticKeyPrg();
		var.n1 = 66;
		var.n2 = 83;
		var.res = var.n1 * var.n2;
		var.word = "will print";
		Calc.word = "reprint";
		System.out.println("Static keyword call by class " +Calc.word);
		System.out.println("Static keyword call by object specific " +var.word);
		System.out.println(var.res);
		obj.show();
		var.disp();
		var.add(6, 9);
		
	}

}
