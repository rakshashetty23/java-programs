import java.util.Scanner;
class Add{
	int sum;
	float total;
	int add(int... values){
		for(int value : values)
		{
			sum = sum + value;
		}
		return sum;
	}
	float add(float... values){
		for(float value : values)
		{
			total = total + value;
		}
		return total;
	}
	
}

public class VarArgsTry{
	public static void main(String args[]){
		Add a = new Add();
		//System.out.println("Enter a total number os elements");
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//int arr[] = new int [n] ;
		//System.out.println("Enter numbers to be added");
		//for(int i=0;i<n;i++)
		//{
		//	arr[i]=sc.nextInt();
		//}
		//System.out.println("Addition is : " + a.add(arr));
		
		System.out.println("Addition is : " +a.add(2.5f, 3, 4f));
	}
}