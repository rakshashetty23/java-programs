import java.util.Scanner;
class StringVowelCheck{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String for vowel count");
		String str1 = scan.nextLine();
		int count = 0;
		int j = str1.length();
		str1 = str1.toLowerCase();
		for( int i = 0; i < str1.length(); i++ )
		{
			if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')
			{
				count = count + 1;
			}
			else
			{
				continue;
			}
		}
		System.out.println(count);
	}
}