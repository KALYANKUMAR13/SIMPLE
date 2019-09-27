import java.util.*;
class Main{
 public static void main(String[] args)
 {
 Scanner scan = new Scanner(System.in);
 String s = scan.nextLine();
 int c=0;
 for(int i=0;i<s.length();i++)
 {
  c=1;
  while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1) )
  {
   i++;
   c++;
  }
  System.out.println(s.charAt(i)+""+c);
 }
}
}

  
