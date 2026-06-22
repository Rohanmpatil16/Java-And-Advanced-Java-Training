package DSA;

import java.util.Scanner;

public class sum_of_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v,s=0;
		int m=1;
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		while(m!=0) {
		 m=a%10;
		 s+=m;
		 v=a/10;
		 a=v;
		}
		System.out.println(s);
		
	}
}
