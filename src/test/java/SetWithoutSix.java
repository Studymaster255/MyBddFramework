import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetWithoutSix {
	public static void main(String[] args) {
		 Set hs=new HashSet();
	     for(int i=1;i<=10;i++)
	     {
	        hs.add(i);
	     }
	     LinkedList ll=new LinkedList(hs);
	     if(ll.contains(6))
	     {
	    	 int index=ll.indexOf(6);
	    	 Object o=ll.remove(index);
		     ll.add(o);
	     }  
	     System.out.println(ll);
	}
	}

