import java.util.Scanner;

public class PrimeNumberExample2 {
	public static boolean checkPrime(int num) {
		if (num==0 || num== 1) {
		return false;}
		else {
			for (int i=2;i<=num/2;i++) 
			{
				if (num%i==0) {
					return false;}
				}
		}
	return true;
		}
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter start number = ");
		int startNum=input.nextInt();
		System.out.println("enter end number = ");
		int endNum=input.nextInt();
		input.close();
		for(int i=startNum;i<=endNum;i++) {
			if (checkPrime(i)) {
				System.out.print(i+" ");
			}
	}
}
}

