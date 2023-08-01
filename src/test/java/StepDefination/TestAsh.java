package StepDefination;

import java.util.Map;
import java.util.TreeMap;

public class TestAsh {
	public static void main(String[] args) {
		String input= "My Name is Ashwini My Name is Ashwini i am B.Tech Graduate";
		String arr[] =input.split(" ");
		 int count=0;
		 Map<String,Integer>map=new TreeMap<String,Integer>();
		 for(int i=0;i<arr.length;i++)
		    {
		        count=0;
		        for(int j=0;j<arr.length;j++)
		        {
		            if(arr[i].equals (arr[j]))
		            {
		            	count++;	
		            }
		            map.put(arr[i], count);
		        }
		    }
		 System.out.println(map);
		 
	}
	
}

/*
String input= "My Name is Ashwini My Name is Ashwini i am B.Tech Graduate";
    String arr[] =input.split(" ");
    int cunt=0;
    Map<String,Interge>Map=new TreeMap<>();
    for(int i=0;i<arr.length;i++)
    {
        count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i].equals (arr[j]))
            count++;
        }
    }
    
    map=map.put(arr[i],count);
    }
    System.out.println(map);
    }
}
 */
