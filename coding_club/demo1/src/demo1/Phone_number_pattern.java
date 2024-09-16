package demo1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Phone_number_pattern 
{
	public static void main(String[] args) {
		String digit="2";
		HashMap<Integer,String> hp=new HashMap<Integer,String>();
		hp.put(2,"abc");
		hp.put(3,"def");
		hp.put(4,"ghi");
		hp.put(5,"jkl");
		hp.put(6,"mno");
		hp.put(7,"pqrs");
		hp.put(8,"tuv");
		hp.put(9,"wxyz");
		
		int key=Integer.parseInt(digit);
		
		int key1=key/10;
		int key2=key%10;
		
		String str1=hp.get(key1);
		String str2=hp.get(key2);
//		System.out.println(str2);
		ArrayList<String> li=new ArrayList<String>();
		for(int i=0;i<=str1.length()-1;i++)
		{
			for(int j=0;j<=str2.length()-1;j++)
			{
				li.add(str1.charAt(i)+""+str2.charAt(j));
//				System.out.println(str1.charAt(i));
//				System.out.println(str1.charAt(j));
			}
		
		}
		System.out.println(li);
		
	}

}
