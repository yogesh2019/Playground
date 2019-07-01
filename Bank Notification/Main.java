import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Details dt = new Details ();
      Scanner in  = new Scanner (System.in);
      String str  = in.nextLine();
     int nu = Integer.parseInt(in.nextLine());
      switch(nu)
      {
          case 1 : 
        dt.notibyCourier(str);
          break;
         case 2 : 
        dt.notibyEmail(str);
          break;
        case 3 : 
        dt.notibyCourier(str);
          break;
      }
    }
}
interface Notification 
{
 public void notibysms(String str);
public void notibyEmail(String str);
 public void notibyCourier(String str);
}
class Details implements Notification 
{
  public void notibysms(String str){
    System.out.println(str+"-Notification by SMS");}
 public void notibyEmail(String str){
  System.out.println(str+"-Notification by Mail");
 }
 public void notibyCourier(String str){
  System.out.println(str+"-Notification by Courier");
 }
}