import java.util.Scanner;



public class ArmstrongNumberExample1 {
	static int length(int num) {
		int a=1,length =0;
		
		while(a<num) {
			length += 1;
			a *= 10;
			
		}
		return length;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the limit = ");
		int num = input.nextInt();
		
		input.close();
		
		for (int j =0;j<= num;j++) 
		{
		
			int i= j;
			double sum = 0;
			
			while(i>0) {
			
				sum = sum + Math.pow((i%10),length(j));
				i/=10;
			}
			if (j==sum) {
				System.out.print(j + ",");
						}
		}
		
		
		
	}
}
