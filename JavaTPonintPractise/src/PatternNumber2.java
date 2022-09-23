
public class PatternNumber2 {
	public static void main(String[] args) {
		int i,j;
		int row=5;
		for (i=row;i>=1;i--) {
			
			for (j=1;j<=i;j++) {
				System.out.print(j);
	
			}
			
			System.out.println();
		}
	}
}
