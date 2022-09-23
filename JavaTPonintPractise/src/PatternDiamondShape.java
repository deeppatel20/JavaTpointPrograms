
public class PatternDiamondShape {
	public static void main (String[] args) {
		int i=0,j,k;
		int row = 5;
		//int row1 = row-1;
		
		  for (i=0; i<row; i++) 
		  { 
			  for (j=(row-i);j>1;j--) 
			  { 
				  System.out.print(" ");
		  
			  }
			  for (k=0;k<(2*i)+1;k++) 
			  { 
				  System.out.print("*"); 
			  } 
			  System.out.println();
		  
		  }
		 
			
		  for (i=0; i<row; i++) 
			  { for (j=1;j<=i;j++) 
				  { System.out.print(" ");
				  
				  }
			  
				for (k=0;k<2*(row-i)-1;k++) 
				  { System.out.print("*");
				  }
				  
			  System.out.println(); }
			 
			 
			
			
		}
			
		
	}


