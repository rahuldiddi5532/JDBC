package array;

public class Fing_minimum_in_array {

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
		int[] arr= {6,8,6,5,8,1,5,8,3};
		System.out.println(findMin(arr));
	}
}
