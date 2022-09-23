
public class PatternDownTrinagle2 {

	public static void main(String[] args) {
		int i,j,k;
		int row =10;
		for (i=row;i>=1;i--) {
			for (j=i;j<=row;j++) {
				System.out.print(" ");}
			
			for (k=1;k<=(2*i)-1;k++) {
				if (k==1||k==(2*i)-1||i==row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println(" ");
		}
		
		
	}

}
