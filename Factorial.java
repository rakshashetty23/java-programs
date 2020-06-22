package virtualclasseg;

public class Factorial {
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		int fact = new java.util.Scanner(System.in).nextInt();
		for(int i = fact-1 ; i>0 ; i--)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of given number is : "+fact);
	}
}
