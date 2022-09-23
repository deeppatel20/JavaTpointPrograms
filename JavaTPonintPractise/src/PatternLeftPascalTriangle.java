
public class PatternLeftPascalTriangle {
	public static void main(String[] args) {
		int i,j,k;
		int row =5;
		for (i=0;i<row;i++) {
			for (j=(row-i);j>1;j--) {
				System.out.print(" ");
			}
			for (k=0;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (i=0;i<row-1;i++) 
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for (k=(row-i);k>1;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
