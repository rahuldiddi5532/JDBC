package string;

public class Revers_words_in_given_string 
{
	public static String rev(String s)
	{
		String str="";
//		
	 int n=s.length();
	  str= str+ s.charAt(n-1);
	  for(int i=1;i<n-1;i++) {
		  str+=s.charAt(i);
	  }
	  str+=s.charAt(0);
		return str;
	}
	public static void main(String[] args) {
		String s="Scanner is class";
		String temp="";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ') {
				temp=temp+ch;
			}
			else {
				res =res+ rev(temp)+" ";
				temp="";
			}
			res += rev(temp)+" ";
		}
		System.out.println(res);
	}

}
