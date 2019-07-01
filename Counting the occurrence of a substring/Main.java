import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str1 = in.nextLine();
		int count = 0 ;
		boolean value = true;
	  for(int i = 0 ; i<=(str.length()-1)-(str1.length()-1) ; i++){
		  if(str.charAt(i)==str1.charAt(0)){
		  for(int j = 0 ; j<str1.length()-1 ; j++){
			  if(str.charAt(i+j)!= (str1.charAt(j))){
					 value = false;
			  }
			  
			  }if(value)
				  count++;}
	  }
	 System.out.println(count);
  } 
}