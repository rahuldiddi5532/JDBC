
public class String_upper_lower 
{
	public static void con(String str)
	{
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch+=32;
			}
			else if(ch>='a'&&ch<='z')
			{
				ch-=32;
			}
			str2=str2+ch;
		}
		System.out.println(str2);
	}
	public static void main(String[] args) {
		con("RaHuL");
	}
}
