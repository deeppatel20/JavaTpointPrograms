
public class PatternDownTrinagle1 {

	public static void main(String[] args) {
		int i,j,k;
		int row =5;
		
			for (i=0; i<row; i++) 
			  { for (j=1;j<=i;j++) 
				  { System.out.print(" ");
				  
				  }
			  
				for (k=1;k<=2*(row-i)-1;k++) 
				  { 
					if (k==1|| k==2*(row-i)-1||i==0 ){
							System.out.print("*");
				  }else { System.out.print(" ");
					  }
				  }
				  
			  System.out.println(); }
		
	}

}
