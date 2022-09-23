import java.util.Scanner;

public class FibonacciExample1 {
	public static void main (String[] args) {
		int a,b=0,c=1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the end limit =  ");
		int num = input.nextInt();
		input.close();
		for (int i =0; i<num;i++) {
			if (i==0 || i==1) {
				System.out.print(i+" ");
			}
			else {
				a=b+c;
				b=c;
				c=a;
				System.out.print(a+" ");
				
			}
		}
	}
}
