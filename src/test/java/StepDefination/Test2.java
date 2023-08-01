package StepDefination;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		 // Count character occurance
		String a="akkshay";
//		a=a.replace("", "");
//		a=a.toLowerCase();
		int count;
		Map hm=new LinkedHashMap();
	    for (int i=0; i<a.length(); i++)
	    {
	    	count=0;
	    	for (int j=0; j<a.length(); j++)
	    	{
	    		if(a.charAt(i)==a.charAt(j))
	    		{
	    			count++;
	    		}
	    		hm.put(a.charAt(i), count);
	    	}
	    }
	       System.out.println(hm);
	}
}


