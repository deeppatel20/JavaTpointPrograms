
public class PatternNumber1 {
	public static void main(String[] args) {
		int i,j;
		int row=5;
		for (i=1;i<=5;i++) {
			
			for (j=row;j>=i;j--) {
				System.out.print(j);
	
			}
			
			System.out.println();
		}
	}
}
