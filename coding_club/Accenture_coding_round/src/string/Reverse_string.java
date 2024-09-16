package string;

public class Reverse_string {

	public static String reverse1(String str)
	{ 
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	public static String reverse2(String str)
	{ 
		String rev="";
		for(int i=0;i<=str.length()-1;i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		String str="Rahul";
		System.out.println("Reverse1 "+reverse1(str));
		System.out.println("Reverse2 "+reverse2(str));
	}
}
