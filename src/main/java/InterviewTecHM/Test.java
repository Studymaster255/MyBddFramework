package InterviewTecHM;

import java.util.ArrayList;
import java.util.List;

import BaseLayer.BaseClass;

public class Test extends BaseClass {
	
	public static void isDigitAndisSynbol(String value)
	{
		char arr[]=value.toCharArray();
		int intcount=0;
		int symbolcount=0;
		List digit=new ArrayList();
		List symbol=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			char a=arr[i];
			if(Character.isDigit(a))
			{
				digit.add(a);
				intcount++;	
			}
			else if(!((Character.isAlphabetic(a))||(Character.isDigit(a))))
			{
				symbol.add(a);
				symbolcount++;
			}
		}
//		System.out.println("Number of digit="+intcount);
//		System.out.println("Number of symbols="+symbolcount);
		System.out.println("Number of digit="+digit.size());
		System.out.println("Number of symbols="+symbol.size());

	}
		public static void main(String[] args) {
		//Find the number of digits and number of special symbols
		String str="DD-4%4432=3df%%%55";
		String str1="335\\n\\\\r\\p$$$##";
		Test.isDigitAndisSynbol(str);
		Test.isDigitAndisSynbol(str1);	
	}
}
