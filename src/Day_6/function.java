package Day_6;

public class function {

	public static void main(String[] args) {
		String s="Rohan";
		int i=s.length()-1;
		int j=0;
		
		fun(i,j,s);
		
	}
	
	public static void fun(int i,int j,String s)
	{
		if(i<0) return;
		System.out.print(s.charAt(i));
		fun(i-1,j,s);

	}

}
