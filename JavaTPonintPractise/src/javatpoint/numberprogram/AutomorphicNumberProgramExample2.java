package javatpoint.numberprogram;

import java.util.Scanner;

public class AutomorphicNumberProgramExample2 {
	static boolean automorphicNumber2(int num) {
		int numSquare =num*num;
		while(num>0) {
			if (num%10 != numSquare%10)
				return false;
			num /= 10;
			numSquare/=10;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the StartNum= ");
		int startNum = input.nextInt();
		int count=0;
		System.out.print("Enter the EndNum= ");
		int endNum = input.nextInt();
		input.close();
		for (int i=startNum; i<=endNum; i++) {
			if (automorphicNumber2(i)) {
				count++;
				System.out.print(i +" ");
				
			}}
			if (count==0) {
				System.out.println("Enter the longer range");
			}
				
			}

		}
	

