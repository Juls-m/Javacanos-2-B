import java.util.Scanner;

public class EXER7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter your first word: ");
		String name1 = myScan.nextLine();
		
		System.out.println("Enter your second word");
		String name2 = myScan.nextLine();
		
		System.out.println("Your word is " + name1 + " " + name2);
		
	}

}