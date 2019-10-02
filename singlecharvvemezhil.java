
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String a="";
		int check = 0;
		for(int i=0;i<s.length();i++)
		{
		    check = 0;
		    for(int j=0;j<a.length();j++)
		    {
		        if(a.charAt(j)==s.charAt(i))
		        {
		        check = 1;
		        break;
		        }
		    }
		    if(check==0 || s.charAt(i)==' ')
		    a+=s.charAt(i);
		}
	    System.out.println(a);
	    
	}
}
