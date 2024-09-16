package demo1;

public class Cound_consonent_in_string 
{
	public static int count(String str)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='a'))
			{
				if((ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')||
						(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
						) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("Rahul"));
	}

}
