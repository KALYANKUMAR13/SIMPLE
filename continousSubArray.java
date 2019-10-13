
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fin = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=scan.nextInt();
		}
		 int temar[] = new int[1000];
		 int c=0,sum=0;
		 for(int i=0;i<n;i++)
		 {
		     sum=0;
		     c=0;
		     for(int j=i; j<n; j++)
		     {
		         sum = sum+arr[j];
		         temar[c] = arr[j];
		         c++;
		         if(sum == fin)
		         {
			    //for(int k=i;k<j;k++)   To inorder not to store the elements in temparray	 
		             for(int k=0;k<c;k++)
		             {
		                 System.out.print(temar[k]+" ");
		             }
		             break;
		         }


		     }
		    for(int k=0;k<c;k++)
		      temar[k]=0;
		 }
	}
}
