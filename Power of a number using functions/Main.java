import java.util.Scanner;
class Main{
   public static void main(String[]args){
   Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int exp = in.nextInt();
     int result = pow(n,exp);
     System.out.print(result);
   }
  public static int pow(int num,int exp){
    int pow = 1;
    for (int  i = 1 ; i<=exp ; i++){
    pow = pow * num;
    }
    return pow;}
  
  }
