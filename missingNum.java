import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    ar[i] = scan.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		    if(ar[i]+1!=ar[i+1])
		    {
		        System.out.print(ar[i]+1);
		        break;
		    }
		}
	}
}
