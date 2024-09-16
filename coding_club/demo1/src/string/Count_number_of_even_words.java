package string;

import java.util.Scanner;

public class Count_number_of_even_words 
{
	public static void print(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{ int c=0;
			while(i<str.length()&&str.charAt(i)!=' ')
			{
				c++;
				i++;
			}
		if(c%2==0&&c!=0)
		{
			count++;
			
		}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string");
//		String str=sc.nextLine();
		String s="rama is a  mana";
		print(s);
//		System.out.println(str);
	}

}
