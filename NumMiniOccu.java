
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		List<Integer> num = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
		    arr[i]= scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    if(num.contains(arr[i]))
		     continue;
		    else
		     {
		         num.add(arr[i]);
		     }
		}
		List<Integer> mm = new ArrayList<Integer>();
		int count=0;
		for(Integer h: num)
		{
		    count=0;
		    for(int i=0;i<n;i++)
		    {
		        if(h==arr[i])
		        {
		            count++;
		        }
		    }
		    mm.add(count);
		}
	System.out.println(num);
		System.out.print(mm);
	int mim =Collections.min(mm);
	int io = mm.indexOf(mim);
		System.out.print(num.get(io));
	 
		
	}
}
