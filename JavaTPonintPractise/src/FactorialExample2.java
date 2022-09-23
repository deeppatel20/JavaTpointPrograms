
// factorial program with recursion method


import java.util.Scanner;

public class FactorialExample2 {
	static int factorial(int n) {
		
		  if (n==0) 
			  return 1; 
		  
		  else
			  return (n*factorial(n-1));
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = input.nextInt();
		int answer = factorial(num);
		input.close();
		System.out.println(answer);
	}
}
