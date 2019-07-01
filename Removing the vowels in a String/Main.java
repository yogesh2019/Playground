import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in  = new Scanner(System.in);
  StringBuilder sb = new StringBuilder(in.nextLine());
    StringBuilder sb1 = new StringBuilder("");
    String str = "aeiou";
    
    
    for(int i = 0 ; i<sb.length(); i++){
      boolean s = true;
     for(int j = 0 ; j<str.length(); j++ ){ 
      if( str.charAt(j)==sb.charAt(i))
        s = false;
     }
       if(s==true)
      System.out.print(sb.charAt(i));
    }
    
  }
}