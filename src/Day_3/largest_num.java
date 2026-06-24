package Day_3;

public class largest_num {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,2,123,6,7,8};
		int lar=0;
		int sec=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>lar)
			{
				sec=lar;
				lar=a[i];
			}
			else if(a[i]>sec)
			{
				sec=a[i];
			}
		}
		System.out.println(lar);
		System.out.println(sec);


	}

}
