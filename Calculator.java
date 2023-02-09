import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int firstOperand = scannerObject.nextInt();
		System.out.println("Enter an Integer");
		int secondOperand = scannerObject.nextInt();
		System.out.println((firstOperand + secondOperand));
    }
}
