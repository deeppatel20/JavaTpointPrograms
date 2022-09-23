
public class PatternDiamondStar {
	public static void main(String[] args) {
	int i,j,k;
	int row=5;
	for (i=1;i<=row;i++) {
		for (j=i;j<=row;j++) {
			System.out.print(" ");
		}
		for (k=1;k<=2*i-1;k++) {
			if (k==1||k==2*i-1) {
			System.out.print("*");
	
		} else {
			System.out.print(" ");
		}
			}
		System.out.println();
	}
	for (i=row-1;i>0;i--) {
		for (j=i;j<=row;j++) {
			System.out.print(" ");
		}
		for (k=1;k<=2*i-1;k++) {
			if (k==1||k==2*i-1) {
			System.out.print("*");
	
		} else {
			System.out.print(" ");
		}
			}
		System.out.println();
	}
}
}
