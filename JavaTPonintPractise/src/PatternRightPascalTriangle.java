
public class PatternRightPascalTriangle {
	public static void main (String[] args) {
		int i,j;
		int row =10;
		for (i=0;i<row;i++) {
			for (j=0;j<=i;j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for (i=1;i<row;i++) {
			for (j=(row-i);j>0;j--) {
				System.out.print("*");
			}		
			System.out.println();
		}
	}
}
