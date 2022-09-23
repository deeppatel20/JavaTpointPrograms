import java.util.Scanner;

public class ReverseNumberExample2 {
	public static void main(String[] args) {
		int a,b=0,c;
		Scanner input = new Scanner(System.in);
		System.out.print("enter the num = ");
		a = input.nextInt();
		input.close();
		for (int i=10000;i>1;i/=10) 
		{c = a%10;
		 b =b*10 +c;
		a/=10;
		}
		System.out.println("reverse nummer = "+ b);
	}
}
