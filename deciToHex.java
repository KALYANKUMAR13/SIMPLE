import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String k="";
		char[] ar= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int cc=0;
		while(n>0)
		{
		     cc = n%16;
		    k = k+ar[cc];
		    n=n/16;
		}
		System.out.print(k);
		
	}
}
