package numbers;

public class Check_circular_prime 
{
	public static boolean checkPrime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{ if(n%i==0)
			{
			c++;
			}
		}
		return c==2;
	}
	
	public static int pow(int n)
	{
		int pow=1;
		for(int i=1;i<=n-1;i++)
		{
			pow=pow*10;
		}
		return pow;
	}
	
	public static boolean checkcircularPrime(int n)
	{
		if(n==0)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		int n1=n;
		int digits=0;
		while(n1!=0)
		{
			if(n1%2==0)
			{
				return false;
			}
			digits++;
			n1=n1/10;
		}
		int pow=pow(digits);
//		System.out.println(digits);
		for(int i=1;i<=digits;i++)
		{
			if(checkPrime(n)!=true)
			{
				return false;
			}
			int last=n%10;
			n=n/10;
			n=(last*pow)+n;
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkcircularPrime(197));
	}
	

}
