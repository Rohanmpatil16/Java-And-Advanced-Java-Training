package Day_3;

import java.util.Scanner;

public class simple_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		display(a);
	}
	
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
