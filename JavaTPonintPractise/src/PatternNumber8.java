
			
public class PatternNumber8 {
	public static void main (String[] args) {
		int i,j,k,number;
		int row =5;
	
		for (i=0;i<row;i++) {
			for (j=i;j<row;j++) {
				System.out.print(" ");
			}
			number=1;
			for (k=0;k<=i;k++) {
				System.out.print(" "+number+" ");
				number =number*(i-k)/(k+1);
				
			
			}
			System.out.println();
		}
}
}
