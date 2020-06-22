package virtualclasseg;

public class AdditionMethod {

	public static void main(String args[]) {
		new AdditionMethod().takeInput();
	}
	
	int firstNum;
	int secondNum;
	
	void add() {	
		displayOutput( firstNum + secondNum );
	}
	
	void takeInput() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		firstNum = sc.nextInt();
		secondNum = sc.nextInt();
		add();
	}
	
	void displayOutput(int result) {
		System.out.println("Addition :" + result);
	}
}
