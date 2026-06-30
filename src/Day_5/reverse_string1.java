package Day_5;

public class reverse_string1 {

	public static void main(String[] args) {
				
		String s="Hello world java ";
		
		String a[]=s.split(" ");
		
		String r=" ";
		
		for(int i=a.length-1;i>=0;i--)
		{
			r+=a[i];
			r+=" ";
		}
		System.out.println(r);
	}

}
