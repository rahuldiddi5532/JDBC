package string;

public class Check_given_string_is_palindrome {

	public static boolean checkPalindrome1(String str)
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return str.equals(rev);
	}
	
	public static void checkPalindrome2(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(str.equals(rev)?"Given string is Palindrome":"Given string is not palindrome");
	}
	
	public static void main(String[] args) {
		String str="rahul";
		System.out.println(checkPalindrome1(str));
		checkPalindrome2(str);
	}
	
}
