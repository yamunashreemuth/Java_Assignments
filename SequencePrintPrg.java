package practise;

public class SequencePrintPrg {

	public static void main(String[] args) {

		for(int i = 0; i<5; i++)
		{
			for(int j =5-i; j>1; j-- )
			{
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++)
			{
				System.out.print("* " );
			}
			System.out.println();
		}
		
		for(int i = 6; i>0; i--)
		{
			
			for(int b=0; b<6-i; b++)
			{
				System.out.print(" ");
			}
			for(int b=0; b<(i-1); b++ )
			{
				System.out.print("# " );
			}
			System.out.println();
		}
		
		}		
			
	}
		
	


