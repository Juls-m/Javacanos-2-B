import java.util.Scanner;

public class EXER4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name = scanner.nextLine();
	
	System.out.println("Enter your roll number: ");
	int roll = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("Enter your field of interest: ");
	String field = scanner.nextLine();
	
	System.out.print("Hey, my name is "+name+ " and my roll number is "
			+ roll + " .My field of interest are "+ field);


	}
}