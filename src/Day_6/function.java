package Day_6;

public class function {

	public static void main(String[] args) {
		int i=0;
		int n=5;
		
		fun(i,n);
		
	}
	
	public static void fun(int i,int n)
	{
		if(i==n) return;
		System.out.println("Rohan");
		
		fun(i+1,n);
		System.out.println("Patil");

	}

}
