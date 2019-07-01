import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int col_row = 1; col_row <= (n+1)/2 ; col_row++){
			
              for (int space = 1 ; space<= col_row - 1;space++ ){
            	  System.out.print(" ");
              }
              System.out.print("*");
              for (int space2 = 1; space2 <=(n-2*(col_row)); space2 ++){
            	  System.out.print(" ");
              }
              if (col_row != (n+1)/2)
              System.out.print("*");
              
              
              System.out.print("\n");
              }
		for (int col_row = 1; col_row <= ((n+1)/2)-1 ; col_row++){
			
            for (int space = 1 ; space<= ((((n+1)/2)-1)-(col_row));space++ ){
          	  System.out.print(" ");
            }
            System.out.print("*");
            for (int space2 = 1; space2 <=(1+2*(col_row-1)); space2 ++){
          	  System.out.print(" ");
            }
            if (col_row != (n+1)/2)
            System.out.print("*");
            
            
            System.out.print("\n");
            }
	}
}