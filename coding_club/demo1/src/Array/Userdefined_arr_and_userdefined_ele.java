package Array;

import java.util.Scanner;

public class Userdefined_arr_and_userdefined_ele 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		int c=0;
		
	    while(size-1>=c)
	    {
		System.out.println("Enter the index");
		int index=sc.nextInt();
		if(a[index]==0)
		{
		System.out.println("Enter the array elements");
		int ele=sc.nextInt();
		a[index]=ele;
		c++;
		}
		else if(index>a.length-1)
		{
			System.out.println("Array index out of bounds..!");
		}
		else
		{
			System.out.println("At index "+index+" element is already added select Another one index");
		}
		
	    }
	    System.out.println("Array elements are");
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
		
		
	}

}
