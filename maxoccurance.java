import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] ar = s.toCharArray();
		int start=0,end=s.length()-1;
		while(start<end)
		{
		    if(!Character.isAlphabetic(ar[start]))
		     start++;
		    else if(!Character.isAlphabetic(ar[end]))
		      end--;
		    else
		    {
		        char temp = ar[start];
		        ar[start] = ar[end];
		        ar[end] = temp;
		        start++;
		        end--;
		    }
		}
		for(int i=0; i<ar.length; i++)
		{
		    System.out.print(ar[i]);
		}
	}
}
