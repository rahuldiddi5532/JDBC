package Pattern;

public class numbers_pattern 
{public static void main(String[] args) {


	int n=5;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=n;j>i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=i;k>=1;k--)
//		{
//			System.out.print(k);
//		}
//		System.out.println();
//	}
	
	
	for(int i=1;i<=n;i++)
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--)
		{
			System.out.print(k);
		}
		System.out.println();
	}
	
	
}
}
