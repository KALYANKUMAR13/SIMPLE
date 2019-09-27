
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String fin = scan.nextLine();
		String p ="";
		int c=0;
		for(int i=0;i<s.length()-fin.length()+1;i++)
		{
		    for( j=i; j<fin.length()+i; j++)
		    {
		        p=p+s.charAt(j);
		    }
		    
		    if(p.equals(fin))
		    {
		        System.out.println(i);
		     c++;
		    }
		    p="";
		}
		for(int i=0;i<y;i++)
		{
		    System.out.print(arst[i]+" ");
		}
		System.out.print(c);
		
	}
}
