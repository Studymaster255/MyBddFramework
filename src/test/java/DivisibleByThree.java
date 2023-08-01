
public class DivisibleByThree {
	public static void main(String[] args) {
		/*
		 * take 1 to 100 number if number is divisible by 3 print""fizz"
		 */
		for(int i=0;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println("Number devisible by Three="+i+"="+"fizz");
			}else if(i%5==0)
			{
				System.out.println("Number devisible by Five="+i+"="+"Buzz");
			}else if((i%5==0)&(i%3==0))
			{
				System.out.println("Number devisible by Five and Three="+i+"="+"fizz and Buzz");
			}
		}
	}

}
