package string;

public class Sount_number_of_consonenets_in_string 
{
	public static void main(String[] args) {
		String str="@Rahul";
		String str2=str.toLowerCase();
		int c=0;
		for(int i=0;i<str2.length();i++)
		{ char ch=str2.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
				{
					c++;
				}
				
			}
		}
		System.out.println(c);
	}

}
