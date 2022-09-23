
public class PatternPyramid2 {

	public static void main(String[] args) {
		int i = 0,j,k;
		
		
		int num=10;
		for (i=0; i<num;i++) {
			for (j=num-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i)+1;k++) {
				if ((k%2)==0) {
					System.out.print(" ");
				}else {
				System.out.print("*");
			}
			
			}
			
			
			System.out.println();
		}

	}

}
