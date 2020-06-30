
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
		int ne[] = new int[n];
		int c=0;
		boolean now = false;
		for(int i=0;i<n;i++)
		{
		    
		    for(int j=0;j<n;j++)
		    {
			    //For String make use of .equals()
		       if(arr[i]== ne[j])
		       {
		           now = false;
		           break;
		       }
		       else
		       {
		          now = true;
		       }
		   }
		   if(now)
		   {
		       ne[c]= arr[i];
		       c++;
		   }
		   
		   
		     
		}
		for(int i=0;i<c;i++)
		{
		    System.out.print(ne[i]+" ");
		}
	}
}
