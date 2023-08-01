package StepDefination;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String s= "mom dad mom mom abc";

		String [] abc= s.split(" ");
		int count=0;
		HashMap hm=new HashMap();
		for(int i=0;i<abc.length;i++)
		{
			//count=0;
			String b="";
			for(int j=abc[i].length()-1;j>=0;j--)
			{
				b=b+abc[i].charAt(j);		
			}
			if(b.equals(abc[i]))
			{
				System.out.println("String is palindrome= "+ abc[i]);
				count++;
			}
		}
		System.out.println(count);
	}
}


