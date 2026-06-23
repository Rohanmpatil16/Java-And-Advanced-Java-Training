package DSA;

public class reverse {

	public static void main(String[] args) {
		int m=0;
		int a=123;
		int reverse=0;
		
		while(a!=0)
		{
			m=a%10;
            reverse = reverse * 10 + m;
			a=a/10;
		}
		System.out.println(reverse);
		

	}

}
