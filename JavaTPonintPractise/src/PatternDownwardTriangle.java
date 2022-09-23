
public class PatternDownwardTriangle {
	public static void main(String[] args) {
		int i,j;
		int row=5;
		for (i=0; i<row; i++) {
			for(j=(row-i); j>0;j--) 
			{
			System.out.print("*");
			
		} 
			System.out.println();
	}
}
}