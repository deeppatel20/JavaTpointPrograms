
public class PatternPyramid1 {
	public static void main (String[] args) {
		int i,j,k,l;
		int num=10;
		for (i=1; i<=num;i++) {
			for (j=num-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for (l=2;l<=i;l++) 
			{
				System.out.print("*");
				}
			
			
			
			System.out.println();
		}
	}
}
