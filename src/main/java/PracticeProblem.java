/*
	File: Lesson 1.11 - Math
	Author: Angie
	Date created: Mar 3, 2026
	Date Last Modified: Mar 3, 2026 
	*/

	import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();

	}

	public static void q1() {
		//Write question 1 code here
		/*Ask the user to "Input a number: ". 
		Output the absolute value of the number. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		Double num = input.nextDouble(); 
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		/*Ask the user to "Input a number: ". 
		Ask the user to "Input another number: ". 
		Divide the first number by the second number. 
		Output the floor result of the 
		answer on one line and the ceiling result on another. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		System.out.print("Input another number: ");
		double num2 = input.nextDouble();

		double num = num1/num2; 
	
		System.out.println(Math.floor(num));
		System.out.println(Math.ceil(num));


	}

	public static void q3() {
		//Write question 3 code here
		/*Ask the user to "Input a number: ".
		Output the square root of the number rounded. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = input.nextDouble();

		num = Math.sqrt(num);
		System.out.println(Math.round(num));
		
	
	}

	public static void q4() {
		//Write question 4 code here
		/* Ask the user to "Input a number: ". 
		Ask the user to "Input another number: ". 
		Output the result of the first number to the power of the second number. */
	
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		System.out.print("Input another number: ");
		double num2 = input.nextDouble();

		System.out.println(Math.pow(num1, num2));

		
	}

	public static void q5() {
		//Write question 5 code here
		/*Ask the user to "Input a number: ". 
		Ask the user to "Input another number: ". 
		Ask the user to "Input one more number: ". 
		Output the max and min values of the three numbers on separate lines.*/
	
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1 = input.nextDouble();

		System.out.print("Input another number: ");
		double num2 = input.nextDouble();

		System.out.print("Input one more number: ");
		double num3 = input.nextDouble();

		double min1 = Math.min(num1, num2); //compare num 1, num 2, take the lesser one
		double max1 = Math.max(num1, num2); //compare num 1, num 2

		System.out.println(Math.max(max1,num3));
		System.out.println(Math.min(min1, num3));
	
	
	}

}
