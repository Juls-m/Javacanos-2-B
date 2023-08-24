import java.util.Scanner;

public class EXER123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	


System.out.println("Enter Integer 1: ");
int x = scanner.nextInt();

System.out.println("Enter Integer 2: ");
int y = scanner.nextInt();
scanner.nextLine();

int sum = x+y;
int product = x*y;

System.out.println("Sum of the two integer is "+sum);
System.out.println("Product of the two integer is " + product);


System.out.println("Enter length");
double length = scanner.nextDouble();
System.out.println("Enter breadth");
double breadth = scanner.nextDouble();

double areatype = length*breadth;

System.out.println("The area of the rectangle " +(int) areatype);



	}
}