import java.util.Scanner;
class StringPalindrome{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String to check for palindrome");
		String str1 = scan.nextLine();
		str1 = str1.toLowerCase();
		String revStr = new String();
		int j = str1.length();
		for(int i = 0; i < str1.length(); i++)
		{
			revStr += str1.charAt(j-1);
			j--;
		}
		
		if(str1.equals(revStr))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not a pslindrome");
		}
		
	}
}