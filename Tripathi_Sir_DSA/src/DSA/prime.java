package DSA;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		boolean isp=true;
		
		if(a<=1)
		{
			isp=false;
		}
		for(int i=2;i<a/2;i++)
		{
		if(a%i==0)
		{
			isp=false;
			break;
		}
		
		}
		
		if(isp==true)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");

		}
	}

}
