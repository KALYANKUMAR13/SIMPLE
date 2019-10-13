

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int shift = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		   arr[i] = scan.nextInt(); 
		}
		System.out.println("1.RIGHT ROTATION  ");
		System.out.println("2.LEFT ROTATION ");
		int rr = scan.nextInt();
		int[] kk = new int[n];
		
		if(rr==1)
		{
		   for(int i=0;i<n;i++)
		  {
		      kk[ (i+shift)%n ] = arr[i];
		  }   
		}
		
		else
		{
		    for(int i=0;i<n;i++)
		    {
		        kk[(i-shift+n)%n] = arr[i];
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(kk[i]+" ");
		}
		
	}
}
