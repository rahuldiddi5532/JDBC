package string;

public class String_count_word 
{
	public static void countWords(String str)
	{
		int count=0;
//		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i==0&&str.charAt(i)!=' '||str.charAt(i)!=' '&&str.charAt(i-1)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		countWords("Scanner is a class");
	}

}
