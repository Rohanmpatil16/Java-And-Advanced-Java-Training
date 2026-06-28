package DSA;

public class HCF {

	public static void main(String[] args) {

		int a=12;
		int b=40;
		int hcf=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		
	}

}
