import java.util.Scanner;

public class arithematicCalculator {

	public static void main(String[] args) {
		
		char Operator;
		double num1,num2,Result;
		
		 // object of Scanner class
		Scanner scanner = new Scanner(System.in);
		
		// Ask user to select an operator
		System.out.println("PLEASE SELECT AN OPERATOR : (+) , (-) , (*) ,(/)");
		Operator = scanner.next().charAt(0);
	
		//Ask user to Enter first number
		System.out.println("ENTER FIRST NUMBER");
		num1 = scanner.nextDouble();
		
		//ask user to enter second number
		System.out.println("ENTER SECOND NUMBER");
		num2 = scanner.nextDouble();
				
		switch(Operator) {
		// for performing Addition
		case '+':
			Result = num1 + num2;
			System.out.print("ANSWER IS : " );
			System.out.print(num1 + " + " + num2 +" = " + Result);
			break;
		
		// for performing Subtraction
		case '-':
			Result = num1 - num2;
			System.out.print("ANSWER IS : " );
			System.out.print(num1 + " - " + num2 +" = " + Result);
		    break;
		//for performing  Multiplication 
		case '*':
			Result = num1 * num2;
			System.out.print("ANSWER IS : " );
			System.out.print(num1 + " * " + num2 +" = " + Result);
			break;
		//For performing division	
		case '/':
			Result = num1 / num2;
			System.out.print("ANSWER IS : " );
			System.out.print(num1 + " / " + num2 +" = " + Result);
			break;
		// if user selected an invalid operator	
		default:
	        System.out.println("YOU ARE SELETED AN INAVLID OPERATOR");
	        break;		
		}
	}
}