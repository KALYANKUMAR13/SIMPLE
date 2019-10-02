
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		List<Integer> rmar = new ArrayList<Integer>();
		for(int i=0; i<n;i++)
		{
		    arr[i] = scan.nextInt();
		    rmar.add(arr[i]);
		}
		int sum = scan.nextInt();
		int tsum=0;
	
		List<Integer> ll = new ArrayList<Integer>();
		for(int i=0;i<n-1;i++)
		{
		    tsum = arr[i];
		    for(int j=i+1;j<n;j++)
		    {
		      tsum = tsum + arr[j];
		      if(tsum == sum)
		      {
		          ll.add(i);
		          break;
		      }
		    }
		}
		boolean now = true;
		if(now)
		{
		    if(arr[n-1]==sum)
		     ll.add(n-1);
		 now =false;     
		}
		System.out.println(ll);
		System.out.println(rmar);
		for(int x=ll.size()-1; x>=0;x--)
		{
		    int m = ll.get(x);
		    rmar.remove(m);
		}
		System.out.print(rmar);
	
	}
}
