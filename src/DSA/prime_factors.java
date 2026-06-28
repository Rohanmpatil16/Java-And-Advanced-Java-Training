package DSA;

import java.util.ArrayList;

public class prime_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=150;
		int div=2;
		
		while(a!=1)
		{
			if(a%div==0)
			{
				System.out.println(div);
				a=a/div;
				
			}
			else 
			{
				div++;
			
			}
		}
	}

}
