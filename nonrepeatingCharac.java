
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
		int c = 0;
		int arcn[] = new int[100];
		char arch[] = new char[100];
		int inc=0;
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
		    arcn[inc]=c;
		    arch[inc]=x;
		    inc++;
		}
		for(int i=0;i<inc;i++)
		{
		    System.out.print(arcn[i]+" ");
		     System.out.print(arch[i]+" ");
		}
		for(int i=0;i<inc;i++)
		{
		    for(int j=0;j<inc-1;j++)
		    {
		        if(arcn[j]>arcn[j+1])
		        {
		            int t =arcn[j];
		            arcn[j]=arcn[j+1];
		            arcn[j+1]= t;
		            
		            char q =arch[j];
		            arch[j] = arch[j+1];
		            arch[j+1] = q;
		            
		        }
		    }
		}
		System.out.println();
		for(int i=0;i<inc;i++)
		{
		    System.out.print(arcn[i]);
		     System.out.print(arch[i]);
		}
	/*	List<Character> ll = new ArrayList<Character>();
		int b[] = new int[100];
		int y=0;
		for(int i=0;i<s.length();i++)
		{
		    for(int j=0;j<inc;j++)
		    {
		       if(s.charAt(i)==arch[j])
		      {
		        b[y]=arcn[j];
		      }  
		    }
		}*/
		int kk=0;
		for(int i=0;i<s.length();i++)
		{
		    for(int j=0;j<inc;j++)
		    {
		        if(s.charAt(i)==arch[j])
		        {
		            //System.out.printf("%c%c",s.charAt(i),arch[j]);
		            //System.out.println();
		            if(arcn[j]==1)
		            {
		                System.out.println(s.charAt(i));
		                kk=99;
		            }
		        }
		    }
		    if(kk==99)
		    {
		        break;
		    }
		}
	}
}
