
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String s3 = scan.nextLine();
		int num[] = new int[s1.length()];
		int num1[] = new int[s2.length()];
		
		int y=0;
		for(int i=0; i<s1.length(); i++)
		{
		    for(int j=0; j<s1.length()+s2.length();j++)
		    {
		        if(s1.charAt(i) == s3.charAt(j))
		        {
		         num[y] = j;
		         y++;
		        }
		    }
		}
		int o=0;
		for(int i=0; i<s2.length(); i++)
		{
		    for(int j=0; j<s1.length()+s2.length();j++)
		    {
		        if(s2.charAt(i) == s3.charAt(j))
		        {
		         num1[o] = j;
		         o++;
		        }
		    }
		}
		for(int i=0;i<y;i++)
		{
		    System.out.print(num[i]);
		}
		System.out.println();
		for(int i=0;i<o;i++)
		{
		    System.out.print(num1[i]);
		}
		boolean r = issort(num);
		boolean n = issort(num1);
        System.out.println(r);
        System.out.println(n);
		if(r && n)
		 System.out.println("SHUFFLES");
		else
		 System.out.print("NOT");
	}
	 public static boolean issort(int[] num)
	{

		for(int i=0;i<num.length-1;i++)
		{
		    if(num[i]<num[i+1])
		    {
		      continue;
		    }
		    else 
		    {
		        System.out.println(num[i]+num[i+1]);
		     return false;
		    }
		}  
		return true;
	}
}

