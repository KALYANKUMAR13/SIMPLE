
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int c = 0;
		for(int i=0;i<s.length()-1;i++)
		{
		  if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(i+1)) ) 
		   continue;
		  else if(Character.isLetter(s.charAt(i)) && Character.isWhitespace(s.charAt(i+1))) 
		  {
		      i++;
		     c++;
		  }
		  else if(Character.isWhitespace(s.charAt(i)) && Character.isLetter(s.charAt(i+1)))
		  {
		    c++;
		   i++;
		   
		  }
		  else
		   {
		       c++;
		   }
		   
		}
		System.out.print(c);
	}
}
