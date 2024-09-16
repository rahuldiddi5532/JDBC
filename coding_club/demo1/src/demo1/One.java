package demo1;

public class One 
{
	public static void print(int[] arr,int target)
	{
		int arr2[]=new int[2];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					arr2[0]=i;
					arr2[1]=j;
					break;
				}
			}
		}
		System.out.println(arr2[0]+" "+arr2[1]);
	}
	public static void main(String[] args) {
		int[] arr= {2,7,10};
		print(arr,9);
//		System.out.println(arr2);
	}

}
