package Array;

public class Print_unique_element_in_array 
{
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,10,50,70};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
