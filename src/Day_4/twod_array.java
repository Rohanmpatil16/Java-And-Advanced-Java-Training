package Day_4;

import java.util.Scanner;

public class twod_array {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		
		for( int j=0;j<a[0].length;j++)
		{
			for(int i=0;i<a.length;i++)
			{
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
