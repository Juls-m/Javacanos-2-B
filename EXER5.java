import java.util.Scanner;

public class EXER5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("Enter side of the square:" );
float side = scanner.nextFloat();

float area= side*side;
float perimeter = 4*side;

System.out.println("Perimeter of the square "+ perimeter);
System.out.println("Area of the square "+ area);




}

}
