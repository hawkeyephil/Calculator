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

        //Ask user to enter a 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division 
		System.out.println("Enter one of the following numbers for the corresponding operation"); 
        System.out.println("1: Addition");
        System.out.println("2: Subtraction"); 
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        //Read in user input 
        int operation = scannerObject.nextInt(); 
        
        //Return the result based on the operation selected and error message
        switch(operation) {
            //Addition 
            case 1: 
                System.out.println((firstOperand + secondOperand));
                break;
            //Subtraction
            case 2: 
                System.out.println((firstOperand - secondOperand));
                break; 
            //Multiplication
            case 3: 
                System.out.println((firstOperand * secondOperand));
                break; 
            //Division
            case 4: 
                System.out.println((firstOperand/secondOperand));
                break; 
            //Error Message
            default: 
                System.out.println("Invalid entry"); 
                break;
        }
    }
}
