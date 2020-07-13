package practise;

public class SelectionStatement {

	public static void main(String[] args) {
		int n = 6;
		//If-else statement
		if(n == 0)
		{
			System.out.println("Nothing");
			
		}
		else if(n % 2 == 0)
		{
			System.out.println(n + " is Even");
		}
		else
		{
			System.out.println(n + " is Odd");
		}
		
		next:for(int a = 1; a<10; a++)
		{
			if(a%2 == 0)
			{
				continue next;
			}
			System.out.println( a);
		}
		
	//Switch case statement
		switch(n) {
		case 1: System.out.println(n +" is one");break;
		case 2: System.out.println(n +" is two"); break;
		case 3: System.out.println(n +" is three"); break;
		case 4: System.out.println(n +" is four"); break;
		case 5: System.out.println(n +" is five"); break;
		case 6: System.out.println(n +" is six");
		break;
		default: System.out.println("No match");
		
		}

	}

}
