package Day_3;

import java.util.Iterator;

public class min_arr {

	public static void main(String[] args) {

		int a[]= {4,2,3,4,5,2,123,6,7,8};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
	}

}
