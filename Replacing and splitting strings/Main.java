import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = in.nextLine();
      String str_arr[] = str1.split(" ");
      for(int i =  0 ; i <str_arr.length ; i++)
        System.out.println(str_arr[i]);
    }
}