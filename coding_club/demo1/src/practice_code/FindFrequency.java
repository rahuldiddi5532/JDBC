package practice_code;

import java.util.HashMap;

public class FindFrequency {

	public static void findFrequency(String str)
	{
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		
		for(char key:hm.keySet())
		{
			System.out.println(key+":"+hm.get(key));
		}
	}
	public static void main(String[] args) {
		findFrequency("rahula");
	}
}
