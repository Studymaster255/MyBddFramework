package TestRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.testng.Assert;
import org.testng.annotations.Test;



public class JavaCode2 {
	
	public List reverse(List mylist){
	    //your code should read the values from a list and reverse the values and return the reversed list.
	    List reverseList=new ArrayList();
	   
	    List orgList=new LinkedList(mylist);
	    
	    Object [] arr=orgList.toArray();
	   // System.out.println(orgList);
	   // System.out.println(arr.length);
	    for(int i=arr.length-1;i>=0;i--)
	    {
	    	reverseList.add(arr[i]);
	    }
	   // System.out.println(reverseList);
//	    ListIterator itr=orgList.listIterator();
//	    while(itr.hasNext())
//	    {
//	    	System.out.println(itr.next());
//	    }
		return reverseList;
}

	    @Test
	    public void test1(){
	        List<String> messageReversed = Arrays.asList("You?", "Are", "How", "Hello");
	        List<String> message = Arrays.asList("Hello", "How", "Are", "You?");
	        Assert.assertEquals(message, reverse(messageReversed));
	    }

	    @Test
	    public void test2(){
	        List<String> message = Arrays.asList("A", "B", "C", "D", "E");
	        List<String> messageReversed = Arrays.asList("E", "D", "C", "B", "A");
	        Assert.assertEquals(message, reverse(messageReversed));
	    }

		@Test
	    public void test3(){
	        List<String> message = Arrays.asList("1", "2", "3", "4", "5","6");
	        List<String> messageReversed = Arrays.asList("6", "5", "4", "3", "2", "1");
	        Assert.assertEquals(message, reverse(messageReversed));
	    }

}
