import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] bin = new int[1100];
		int c=0;
		while(n>0)
		{
		    bin[c] = n%2;
		    n = n/2;
		    c++;
		}
		for(int i=c-1;i>=0;i--)
		{
		    System.out.print(bin[i]);
		}
	}
}
