
public class PatternNumber6 {
	public static void main(String[] args) {
		
			int i,j,k=0;
			int row=5;
			for (i=1;i<=row;i++) {
				
				for (j=1;j<=i;j++) {
					System.out.print(++k + " ");
		
				}
				
				System.out.println();
			}
	}
}
