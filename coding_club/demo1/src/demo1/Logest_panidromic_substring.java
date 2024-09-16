package demo1;

public class Logest_panidromic_substring 
{
	public static boolean Checkplain(String s)
	{
		String rev="";
		for(int i=0;i<=s.length()-1;i++)
		{
			rev=s.charAt(i)+rev;
		}
		
		return rev.equals(s);
	}
	
	public static void main(String[] args) 
	{
		String str="abbadd";
		String max="";
		for(int i=0;i<=str.length()-1;i++)
		{
			String temp=""+str.charAt(i);
			for(int j=i+1;j<=str.length()-1;j++)
			{
				temp=str.charAt(j)+temp;
				if(Checkplain(temp)&&max.length()<temp.length())
				{
					max=temp;
				}
			}
		}
		System.out.println(max);
		
	}

}
