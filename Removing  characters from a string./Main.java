import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
   StringBuilder sb = new StringBuilder(in.nextLine());
   StringBuilder sb1 = new StringBuilder(in.nextLine());
    
    for(int i = 0 ; i<sb1.length() ; i++){
   
     for(int j = 0 ; j<sb.length() ; j++){
     if(sb.charAt(j)==sb1.charAt(i))
       sb.delete(j,j+1);
     }
  }
    System.out.println(sb);
}}