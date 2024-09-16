package rangappa_coding_test;

import java.util.HashMap;

public class Count_number_of_sub_arry 
{
	public  static int count(int[] a,int k)
	{
		HashMap<Integer,Integer> m1=new HashMap<Integer,Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(k==a[i])
			{
				if(m1.containsValue(m1.get(a[i])))
				{
				   m1.put(a[i],m1.get(a[i])+1);	
				}
				else
				{
					 m1.put(a[i],1);	
				}
			}
			else
			{
				m1.put(a[i],1);
			}
		}
		int val=0;
		for(int e:m1.keySet())
		{
			if(e==k)
			{
				val=m1.get(e);
			}
		}
		return val;
	}
	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1};
		int k=1;
//		int[] arr= {10,1,3,5,2};
//		int k=100;
		System.out.println(count(arr,k));
	}

}
