import java.util.Scanner;

public class ArmstrongNumberExample2 {
	static int armstrong(int num) {
		
		int j=num, digits=0, i=num, sum = 0;
		
		 
		while (i>0) {
			i/=10;
			digits++;
		}
		while (j>0) {
			sum = sum + (int) Math.pow(j%10, digits);
			j/=10;
		}
		return sum;
		
		
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the end limit of number: ");
		int abcnum = input.nextInt();
		input.close();
		
	for (int num = 0; num<=abcnum; num++) {
		if (num == armstrong(num))
				{
			System.out.print(num + ", ");
		}
	}
}
}
