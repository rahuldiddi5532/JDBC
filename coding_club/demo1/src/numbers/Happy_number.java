package numbers;

public class Happy_number 
{
		public static boolean checkHappy(int n)
		{	while(n!=1&&n!=4)
			{
				int sum=0;
				while(n>0)
				{
					int rem=n%10;
					sum+=rem*rem;
					n=n/10;
				}
				n=sum;
			}
			return n==1;
		}
	public static void main(String[] args) {
		if(checkHappy(7))
		{
			System.out.println("happy number");
		}
		else
		{
			System.out.println("not happy number");
		}
	}
	

}
