import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//int even[] = new int[1000];
		int odd[] = new int[1000];
		int e=0,o=0;
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
		    set.add(s.charAt(i));
		}
		
		int c=0;
		for(char x : set)
		{
		    c=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(x==s.charAt(i))
		        {
		            c++;
		        }
		    }
		     if(c%2 !=0)
		        {
		            odd[o]=c;
		            o++;
		        }
		        
		}
		for(int i=0;i<o;i++)
		{
		    System.out.print(odd[i]);
		}
		if(o>=2)
		     System.out.println("No");
		 else
		     System.out.println("YES");
	}
}
