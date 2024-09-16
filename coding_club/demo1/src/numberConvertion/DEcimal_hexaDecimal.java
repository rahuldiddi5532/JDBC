package numberConvertion;

import java.util.Scanner;

public class DEcimal_hexaDecimal 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the decimal number");
		int dec=sc.nextInt();
		
		String hexa="";
		while(dec>0)
		{
			int rem=dec%16;
			if(rem>9)
			{
				hexa=(char)(rem+55)+hexa;
			}
			else
			{
				hexa=rem+hexa;
			}
			dec=dec/16;
		}
		System.out.println(hexa);
	}

}
