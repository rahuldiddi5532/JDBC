package string;

import java.util.Arrays;

public class capital_char 
{
	public static void main(String[] args) {
		String s="ram is good HELLO JAVA 123@#$ RaHul rAhUL";
		String res="";
		for(int i=0;i<s.length();i++)
		{ 
		  char ch=s.charAt(i);
		  char chprivious=' ';
		  if(i>=1)
		  {
			  chprivious=s.charAt(i-1);
		  }
		  if(chprivious==' '&&ch>='a'&&ch<='z')
		  {
			  ch=(char)(ch-32);
		  }
		  else if(chprivious!=' '&&ch>='A'&&ch<='Z')
		  {
			ch=(char)(ch+32);  
		  }
		  res=res+ch;
		}
//	    String str=Arrays.toString(a);
	     System.out.println(res);
	}

}
