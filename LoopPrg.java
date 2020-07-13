package practise;

public class LoopPrg {

	void show(String name)
	{
		System.out.println("Hello " + name);
		return;
	}
	public static void main(String[] args) {
		
		//While loop
		int r = 4;
		while(r <= 10)
		{
			System.out.println(r + " ");
			r++;
		}
		
		//do while loop
		do {
			System.out.println( "value of r is " + r);
		} 
		while(r < 10);
		
		//return, continue & break statement
		
		int limit = 6;
		LoopPrg t = new LoopPrg();
		t.show("Java");
		
		outer: for(int i = 1;  ;i++)
		{
			for(int j = 1;j<6; j++)
			{
				if(j>i)
				{
					System.out.println();
					continue outer;
				}
			System.out.print(" " + (j));
			System.out.println();
			if(i == limit)
			{
				break outer;
			}			
		}
	
		}
	
		//Nested For loop
		for(char i = 65; i <= 71;i++)
		  {
		   for(char j = 65; j<=i;j++)
		   {
		    System.out.print(j+" ");
		   }
		   System.out.println();
		  }
	
	}
}
