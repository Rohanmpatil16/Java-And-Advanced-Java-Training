package Day_5;

public class reverse_string {

	public static void main(String[] args) {
		
		String str="xyz";
		StringBuilder a=new StringBuilder();
//		String rev=" ";
		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			rev+=str.charAt(i);
//		}
//		System.out.println(str);
//		System.out.println(rev);
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			a.append(str.charAt(i));
		}
		System.out.println(a);
	}

}
