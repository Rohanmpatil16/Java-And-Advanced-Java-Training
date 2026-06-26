package Day_4;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,30,40,50,60};
		int b=30;
		
		binary(a,b);
	}
	
	public static void binary (int a[],int b)
	{
		int i=0;
		int j=a.length-1;
		
		while(i<=j)
		{
			int div=i+j/2;
			if(a[div]==b)
			{
				System.out.println("congratulations,you find a number") ;
				return;
			}
			else if(a[div]>b)
			{
				j=j-1;
			}
			else {
				i=div+1;
			}
		}
		System.out.println("number not found");
		
	}

}
