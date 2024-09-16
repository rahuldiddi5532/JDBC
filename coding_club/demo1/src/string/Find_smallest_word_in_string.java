package string;

import java.util.Scanner;

public class Find_smallest_word_in_string 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		int len=str.length();
		for(int i=0;i<str.length();i++)
		{
			String temp="";
			while(i<str.length()&&str.charAt(i)!=' ')
			{
				temp=temp+str.charAt(i);
				i++;
			}
			if(len>temp.length()&&temp.length()!=0)
			{
				len=temp.length();
				res=temp;
			}
		}
		System.out.println(res);
		
	}
}
