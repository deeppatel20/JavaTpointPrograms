
import java.util.Scanner;

public class PalindromExample2 {
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string: ");
		original = input.nextLine();
		input.close();
		int length = original.length();
		for (int i = length-1;i>=0; i--) {
			reverse = reverse + original.charAt(i);
			
		}
		if (original.equals(reverse)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
