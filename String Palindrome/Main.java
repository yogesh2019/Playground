import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
		String str = in.nextLine();
	   StringBuilder sb = new StringBuilder(str);
	   StringBuilder sb1 = new StringBuilder(str);
	   int j = 0; 
	   for(int i=str.length()-1 ; i>=0; i--){
		  
		   sb.setCharAt(i,str.charAt(j));
		   j++;
	   }
	   
	  boolean k = true;
	   for(int i = 0 ;i<str.length() ; i++){
		   char ch = sb.charAt(i); 
		  char ch2 =  sb1.charAt(i);
		  if (ch != ch2)
				   k = false;
	   }
	   if(k)
		System.out.println("Yes");
	   else
		   System.out.println("No");
	 
    } 
}