
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] arch = s.toCharArray();
	    StringBuilder sd = new StringBuilder();
	    for(int i=0;i<s.length(); i++)
	    {
	        if(Character.isLetter(s.charAt(i)))
	         sd.append(s.charAt(i));
	    }
	    sd = sd.reverse();
	    String rev = sd.toString();
	    int c=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if(Character.isLetter(arch[i]))
	        {
	            arch[i] =rev.charAt(c);
	            System.out.print(arch[i]);
	            c++;
	        }
	        else 
	         System.out.print(" ");
	    }
	}
}
