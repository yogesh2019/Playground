import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0 ; i<list.length ; i++){
       list[i] = in.nextInt();
    }
    max(list,n);
  }
  public static void max(int list[], int n ){
  int max = 0 ;
    int index = 0 ;
    for(int i = 0 ; i<list.length; i++){
      if (list[i]>=max)
      {max = list[i];
       index = i;
      }
    }
    System.out.println(index);
  }
}