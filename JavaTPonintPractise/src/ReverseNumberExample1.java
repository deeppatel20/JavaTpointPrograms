import java.util.Scanner;

public class ReverseNumberExample1 {  
	public static void reverseNumber(int number) {
		
		if (number<10) {
			System.out.println(number);
			return;
		}
		else {
			
			System.out.print(number%10);
			reverseNumber(number/10);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number = ");
		int a = input.nextInt();
		input.close();
		System.out.println("reverse number is = ");
		reverseNumber(a);
	}
}
	