package demo1;

public class Longest_sub_string_without_repeat 
{
	public static void main(String[] args) {
		String str="abcabcb";
		String temp="";
		for(int i=0;i<=str.length()-1;i++)
		{
			temp=""+str.charAt(i);
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					temp=temp+str.charAt(j);
				}
			}
			
		}
		System.out.println(temp);
	}

}
