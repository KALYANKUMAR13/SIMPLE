
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




/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        List<Integer> kk = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
          if(kk.contains(arr[i]))
           continue;
          else
           kk.add(arr[i]);
        }
        System.out.print(kk);
        List<Integer> ll = new ArrayList<Integer>();
        for(int x: kk)
        {
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(x==arr[i])
                 c++;
            }
            ll.add(c);
        }
        System.out.println(ll);
        
        int lear[] = new int[ll.size()];
        int lp[] = new int[kk.size()];
        
        for(int i=0;i<ll.size();i++)
        {
            lear[i] = ll.get(i);
            lp[i] = kk.get(i);
        }
        for(int i=0;i<ll.size();i++)
        {
            System.out.print(lear[i]+" ");
        }
        for(int i=0;i<ll.size();i++)
        {
            for(int j=0;j<ll.size()-1;j++)
            {
                if(lear[j]<lear[j+1])
                {
                    int t =lp[j];
                    lp[j] = lp[j+1];
                    lp[j+1] = t;
                }
            }
        }
        System.out.println();
        for(int i=0;i<ll.size();i++)
        {
            System.out.print(lp[i]+" ");
        }
        
	}
}




