
public class PatternNumber4 {
	public static void main (String[] args) {
		int i,j,k;
		int row = 5;
		for (i=1;i<=row;i++) {
			for (j=i;j<row;j++) {
				System.out.print(" ");
			}
			for (k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
