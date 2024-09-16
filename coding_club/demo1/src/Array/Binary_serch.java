package Array;

public class Binary_serch 
{
	 public static void main(String[] args) {
	        int[] arr={5,9,17,23,25,45,59,63,71,89};
	        int l=0; int h=arr.length-1;
	        int key=23;
	        System.out.println("hi");
	        while(l<h)
	        {
	        	int mid=l+h/2; 
	        	if(key==arr[mid])
	        	{
	        		System.out.println("elemnt is found at index "+mid);
	        		break;
	        	}
	        	else if(key<arr[mid])
	        	{
	        		h=mid-1;
	        	}
	        	else
	        	{
	        		l=mid+1;
	        	}
	        }
	        
	 }

}
