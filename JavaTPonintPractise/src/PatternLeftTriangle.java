
public class PatternLeftTriangle {
	public static void main (String[] args) {
		int i,j;
		int row=10;
		for (i=1;i<=row;i++) 
		{
			for (j=(row-i);j>0;j--) 
			{
				System.out.print(" ");
				
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("*");
			
			}
			System.out.println();
			
		}
		
		}
}