
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		char[] aar = a.toCharArray();
		char[] bar = b.toCharArray();
		Arrays.sort(aar);
		Arrays.sort(bar);
		if(a.length()==b.length())
		 {
		     boolean no=true;
		     for(int i=0;i<aar.length;i++)
		     {
		       if(aar[i]==bar[i])
		        no=true;
		       else
		        no= false;
            break;
		     }
		     if(no)
		      System.out.print("ANAGRAM");
         else
          System.out.print("NOT ANAGRAM");
		 }
		 else
		 {
		     System.out.print("NOTANAGRAM");		 }
	}
}
