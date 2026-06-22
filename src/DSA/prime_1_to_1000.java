package DSA;


public class prime_1_to_1000 {
	public static void main(String[] args) {
		for(int i=2;i<=1000;i++)
		{
			boolean isp=true;
			for(int j=2;j<=i-1;j++)
			if(i%j==0)
			{
				isp=false;
				break;
				
			}
			if(isp==true)
			
			{
				System.out.println(i);
			}
		}
	}
}
