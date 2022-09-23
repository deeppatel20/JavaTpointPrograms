package javatpoint.numberprogram;

import java.util.Scanner;

public class AutomorphicNumberProgramExample1 {
	static boolean automorphicNumber(int num) {
	int numSquare=num*num;
	System.out.println("Square of the num = "+ numSquare);
	
	while (num>0) {
	if (num%10 != numSquare%10) 
		
		return false;
		num /= 10;
		numSquare /=10;
	}
	return true;
	}
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = input.nextInt();
		input.close();
		if (automorphicNumber(num))
		{
			System.out.println("number is automorphic");
		}
		else {
			System.out.println("number is not automorphic");
		}
		
	}
}
