import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
         Pattern ptn = Pattern.compile("(,| |and|or)");
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String seg[] = ptn.split(str);
      for(String par : seg)
      {
         System.out.println(par);
      }
    }
}