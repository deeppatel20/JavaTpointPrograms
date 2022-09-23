import java.util.Scanner;

public class ReverseStringExample1 {
	public static void main (String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the string = ");
		String name =input.nextLine();
		input.close();
		String reverse ="";
		int length = name.length();
		for (int i=length-1;i>=0;i--) {
			reverse = reverse + name.charAt(i);
			
		}
		System.out.print("Reverse string = " +reverse);
	}
}
