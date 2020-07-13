package practise;

public class T_06 {
	
	public int getMaxNumber(int n1, int n2, int n3) {
		int max;
		max = n1;
		if(n1<=0||n2<=0||n3<=0) {
			int output = -1;
			System.out.println(output);
			
		}
		else {
			if(max >= n2 && max >= n3)
			{
				max = n1;
				System.out.println(max);
			}
			if (n2 >= n1 && n2 >= n3){
				max = n2;
				System.out.println(max);
			}
			else {
				max = n3;
				System.out.println(max);
			}
		}
		 return max;
	}

	public static void main(String[] args) {
		int n11 = 6;
		int n22 = -4;
		int n33 = 91;
		
		T_06 aMaxno = new T_06();
		aMaxno.getMaxNumber(n11, n22, n33);

	}

}
