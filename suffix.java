
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] ar = s.split(" ");
		String first = ar[0];
		List<Integer> sslen = new ArrayList<Integer>();
		for(int i=1; i<ar.length; i++)
		{
		    String sec=ar[i];
		    int c=0;
		    int min = first.length()<sec.length()?first.length():sec.length();
		    for(int j=1;j<=min;j++)
		    {
		        if(first.charAt(first.length()-j) ==sec.charAt(sec.length()-j))
		          c++;
		    }
		    sslen.add(c);
		}
		int noChar = Collections.min(sslen);
		for(int i=first.length()-noChar; i<first.length(); i++)
		{
		   System.out.print(first.charAt(i)); 
		}
		
	}
}
