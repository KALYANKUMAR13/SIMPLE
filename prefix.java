
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
		    for(int j=0;j<min;j++)
		    {
		        if(first.charAt(j) ==sec.charAt(j))
		          c++;
		    }
		    sslen.add(c);
		}
		int noChar = Collections.min(sslen);
		System.out.print(first.substring(0,noChar));
	}
}
