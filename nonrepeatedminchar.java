/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		List<Character> ll = new ArrayList<Character>();
		for(int i=0;i<s.length(); i++)
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
		int [] arch = new int[ll.size()];
		int h=0;
		for(char v:ll)
		{
		    c=0;
		 	for(int i=0;i<s.length();i++)
		    {
		      if(v==s.charAt(i))
		      {
		       c++;   
		      }
		    }
		    if(c==1)
		     {
		         System.out.print(v);
		         break;
		     }
		     else{
		      continue;
		     }
		}
	
	
	}
}
