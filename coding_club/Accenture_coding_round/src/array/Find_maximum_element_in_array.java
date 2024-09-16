package array;

public class Find_maximum_element_in_array {

	public static int findMax(int[] arr)
	{
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMin(int[] arr)
	{
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {600,500,100,5,7,8,3,2};
		System.out.println("Maximum element in given array: "+findMax(arr));
		System.out.println("Minimum element is given array: "+findMin(arr));
	}
}
