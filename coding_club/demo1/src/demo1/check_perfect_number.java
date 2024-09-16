package demo1;

public class check_perfect_number 
{
   public static boolean check(int n)
   {
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==n)
			{
				return true;
			}
			return false;
					}

	public static void main(String[] args) {
		for(int i=1;i<=10000;i++)
		{
			if(check(i))
			{
				System.out.print(i+",");
			}
		}
	}
}

