import java.util.Scanner;

public class PrimeNumberExample1 {
	public static void main(String[] args) {
		int a=0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num=input.nextInt();
		input.close();
		if (num==0 || num== 1) {
			System.out.println("number is not prime");
					}
		else {
			for (int i=2;i<=num/2;i++) {
				if (num%i==0) {
					System.out.println("number is not prime");
					a=1;
					break;
				}
				}
		if (a==0) {
					System.out.println("number is prime");
				}
			}
		}
		
	}

