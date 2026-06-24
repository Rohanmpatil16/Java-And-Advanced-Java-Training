package Day_3;

public class second_largest {
	public static void main(String[] args) {
		
		int a=1025;
		int sec=-1;
		int lar=-1;
		while(a!=0)
		{
			int mod=a%10;
			if(mod>lar)
			{
				sec=lar;
				lar=mod;
				
			}
			else if(mod >sec && mod!=lar)
			{
				sec=mod;
			}
			a=a/10;
		}
		System.out.println(sec);
	}
}
