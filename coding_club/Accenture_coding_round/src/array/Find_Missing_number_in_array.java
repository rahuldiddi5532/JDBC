package array;

public class Find_Missing_number_in_array {

	public static int findMissNum(int n,int[] arr)
	{
		int res=n*(n+1)/2;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return res-sum;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		int n=5;
		System.out.println(findMissNum(n, arr));
	}
}
