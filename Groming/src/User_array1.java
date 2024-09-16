import java.util.Scanner;

//create the array on user input and print the even indexed element in array
public class User_array1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of the array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the array element");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
			System.out.print(arr[i]+" ");
			}
		}
		sc.close();

		}

}
