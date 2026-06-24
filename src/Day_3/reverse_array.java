package Day_3;

public class reverse_array {

	public static void main(String[] args) {
		
		int a[]= {3,5,6,11,4,5};
//		int b[]=new int[a.length];
//		int i;
//		
//		for( i=a.length-1;i>=0;i--)
//		{
//			b[i]=a[i];
//			System.out.print(b[i]+" ");
//
//		}
		int i=0,j=a.length-1;
		while(i<j)
			{
				int swap=a[i];
				a[i]=a[j];
				a[j]=swap;
				
				i++;
				j--;
			}
		
		for(int num:a)
		{
		System.out.print(num+" ");
		}
	}

}
