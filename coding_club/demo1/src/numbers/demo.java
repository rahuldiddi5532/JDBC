package numbers;

public class demo 
{
	public static void main(String[] args) {
		int a=4,b=8;
		if((b-a--)>=a)//4>=3
		{
			if((b+a)%2==1)
			{
				System.out.println(a*b);
			}
			else
			{
				System.out.println(a+b);
			}
		}
	}
	
}
