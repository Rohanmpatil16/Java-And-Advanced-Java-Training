package DSA;

public class Armstrong {

	public static void main(String[] args) {

		int a=153,c=0,temp=a;
		int sum=0;
		int raisto=0;
		int original=a;
		
		while(temp!=0)
		{
			temp=temp/10;
			c++;
			
		}
		System.out.println("count is "+c);
		
		while(a!=0)
		{
			int m=a%10;
			raisto=(int) Math.pow(m,c);
			sum+=raisto;
			 a = a / 10; 
		}
		
		if(sum==original)
		{
			System.out.println("Armstorm num");
		}
		else {
			System.out.println("Not Armstorm");
		}
	}

}
