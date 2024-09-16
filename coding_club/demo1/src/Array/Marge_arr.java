package Array;

public class Marge_arr 
{
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {10,20,30,40};
		int[] arr= new int[a.length+b.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				arr[j]=a[j];
			}
			for(int k=0;k<b.length;k++)
			{
				arr[a.length+k]=b[k];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
