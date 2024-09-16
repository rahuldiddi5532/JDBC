package Array;

public class Array_element_digit_sum 
{
	public static void main(String[] args) {
		int[] arr= {15,17,12,13};
		for(int i=0;i<=arr.length-1;i++)
		{
			int sum=0;
			int ele=arr[i];
			while(ele>0)
			{
				int rem=ele%10;
				sum=sum+rem;
				ele=ele/10;
			}
		    arr[i]=sum;
		}
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.print(arr[i]+" ");
	}
	}

}
