import java.util.Scanner;

public class FactorialExample1 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = input.nextInt();
		input.close();
		int factorial=1;
		while(num>0) {
			factorial = factorial*num;
			num -= 1;
		}
		System.out.println("factorial is = " + factorial);
	}
}
