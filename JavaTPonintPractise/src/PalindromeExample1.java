import java.util.Scanner;

public class PalindromeExample1 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		input.close();
		int temp =0, n;
		int s = num;
				
		while(s>0) {
			n = s%10;
			temp = (temp*10) + n;
			s /= 10;
	}
		if (num==temp) {
			System.out.println("numebr is palindrome");
		}
		else {
			System.out.println("number is not palindrome");			
		}
	}
}
