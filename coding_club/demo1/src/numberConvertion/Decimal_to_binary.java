package numberConvertion;

public class Decimal_to_binary 
{
	public static void binary(int n)
	{
		String bi="";
		while(n>0)
		{
			int rem=n%2;
			bi=rem+bi;
			n=n/2;
		}
		System.out.println(bi);
	}
	public static void main(String[] args) {
		binary(20);
	}
}
