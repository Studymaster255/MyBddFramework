
public class OccuranceAkk {

	public static void main(String[] args) {
		String a="Welcome to the Michelin interview. Best of luck to you";
	    int count = 0;
	    String []arr=a.split(" ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i].equals("to"))
	    	{
	    		count++;
	    	}	
	    }
	    System.out.println(count);
	}
}
