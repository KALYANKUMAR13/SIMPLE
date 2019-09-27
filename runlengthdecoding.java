import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] ar = new char[100];
		int[] numar = new int[100]; 
		int y=0;
		int c = 0,nc=0;
		String k = "";
		
		for(int i=0; i<s.length()-1; i++)
		{
		    if(Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i+1)))
		     {
		      ar[c] = s.charAt(i);
		      c++;
		     } 
		    else if(Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i+1)))
		      k = k+s.charAt(i);
		    else if(Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i+1)))
		    {
		        k=k+s.charAt(i);
		        y=Integer.parseInt(k);
		        numar[nc]=y;
		        nc++;
		        k="";
		    }
		}

		k=k+s.charAt(s.length()-1);
	
		y=Integer.parseInt(k);
		numar[nc]=y;
		nc++;
		
		for(int i=0;i<nc;i++)
		{
		   for(int j=0;j<numar[i];j++)
		   {
		       System.out.print(ar[i]);
		   }
		}  
	}
}
