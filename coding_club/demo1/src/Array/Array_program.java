package Array;

public class Array_program 
{public static void main(String[] args) {
	
	int[] arr= {1,4,5,2,3,8};
	int n=6;
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]+arr[j]==n)
			{
				System.out.println(arr[i]+","+arr[j]);
				
			}
		}
		}
}
	

}
