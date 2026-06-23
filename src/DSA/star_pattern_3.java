package DSA;

public class star_pattern_3 {

	public static void main(String[] args) {

		int n=5;
		int s=2*n-3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=s;k++)
			{
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
			s-=2;
				
		}
		
	}
			
			
		
}


