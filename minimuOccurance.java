
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
		    set.add(s.charAt(i));
		}
		int c=0,min=0;
		char minCh = ' ';
		boolean now = true;
		for(char x : set)
		{
		   c=0;
		   for(int i=0;i<s.length();i++)
		   {
		       if(x==s.charAt(i))
		       {
		          c=c+1; 
		       }
		   }
		   if(now)
		   {
		       now = false;
		       min = c;
		       minCh = x;
		   }
		   if(c<min)
		   {
		       min = c;
		       minCh = x;
		   }
		}
		System.out.print(minCh);
	}
}
