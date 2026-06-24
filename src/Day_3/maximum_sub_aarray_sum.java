package Day_3;

public class maximum_sub_aarray_sum {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(max<=sum)
				{
					max=sum;
					
				}
			}
		}
		System.out.println(max);
	}

}
