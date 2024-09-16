package Pattern;

public class Dimond_pattern 
{
	public static void main(String[] args) {
		int n=5;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=sp;l++)
			{
				System.out.print(" ");
			}
			if(i%2==0)
			{
				sp++;
			}
		}
	}

}
