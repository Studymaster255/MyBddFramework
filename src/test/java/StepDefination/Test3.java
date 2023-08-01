package StepDefination;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		String ss="swapnil swapnil akshay qa"; 
		String[] a=ss.split(" ");
		//String[] a= {"akshay","swapnil","akshay","QA"};
//		a=a.replace("", "");
//		a=a.toLowerCase();
		int count;
		Map hm=new LinkedHashMap();
	    for (int i=0; i<a.length; i++)
	    {
	    	count=0;
	    	for (int j=0; j<a.length; j++)
	    	{
	    		if(a[i]==a[j])
	    		{
	    			count++;
	    		}
	    		hm.put(a[i], count);
	    	}
	    }
	       System.out.println(hm);
	}
	}


