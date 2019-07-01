import java.util.*;
public class Main<T> 
{ 
   T t;
  public static void main(String[] args) 
     { 
     Scanner in = new Scanner(System.in);
       Main<Integer> m =new Main<Integer>();
       Main<String> s =new Main<String>();
       Main<Float> f =new Main<Float>();
       int  n = in.nextInt();
        m.t = n;
        System.out.println("Integer Value: "+m.t);
        in.nextLine();
        String str  = in.nextLine();
        s.t = str;
        System.out.println("String Value: "+s.t);
        float fl = in.nextFloat();
        f.t = fl ;
        System.out.println("Float value: "+f.t);
       }
 }