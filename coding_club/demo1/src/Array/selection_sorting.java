package Array;

public class selection_sorting 
{
	public static void selectionSort(int[] arr)
	{
       int min=0;
		for(int i=0;i<arr.length-1;i++)
		{ min=i;
		   for(int j=i+1;j<arr.length;j++)//0+1=1-->1+1=2-->
		   {
			   if(arr[min]>arr[j])
			   {
				  min=j;//j=0
			   }
		   }
		  if(min!=i)
		  {
		 
			   int temp=arr[i];
			   arr[i]=arr[min];
			   arr[min]=temp;
		  }
			
		}
		
	}
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {8,7,12,2,4,6};
		selectionSort(a);
		print(a);
	}

}
