
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		List<Character> ll = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++)
		{
		    
		    if(ll.contains(s.charAt(i)))
		    {
		        continue;
		    }
		    else
	        {
		     ll.add(s.charAt(i));
	        }
		}
		int c=0;
		for(char x : ll)
		{
		    c=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(x==s.charAt(i))
		        {
		            c++;
		        }
		    }
		    System.out.println(x+":"+c);
		}
	}
}
