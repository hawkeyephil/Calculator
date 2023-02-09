import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Create a scanner object to read in user input 
        Scanner scannerObject = new Scanner(System.in);
        //Ask for operand 1 and read in that integer 
		System.out.println("Enter an Integer");
		int firstOperand = scannerObject.nextInt();
        //Ask for operand 2 and read in that integer 
		System.out.println("Enter an Integer");
		int secondOperand = scannerObject.nextInt();

        //Ask user to enter a 1 for addition or 2 for subtraction 
		System.out.println("Enter 1 for addition and 2 for subtraction"); 
        //Read in user input 
        int operation = scannerObject.nextInt(); 
        //Return the result based on the operation selected
        switch(operation) {
            //Addition 
            case 1: 
                System.out.println((firstOperand + secondOperand));
                break;
            //Subtraction
            case 2: 
                System.out.println((firstOperand - secondOperand));
                break;
        }
    }
}
