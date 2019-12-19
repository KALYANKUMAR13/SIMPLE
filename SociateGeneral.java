import java.util.*;
public class SociateG {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
		int x = scan.nextInt();
		 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(x==arr[i][j])
				{
					int s = i+j;
					int m = s%4;
					int k=0;
					if(m==1)
					{
						 k = arr[i+1][j];
						add(k);
					}
					else if(m==2)
					{
						k = arr[i-1][j];
						add(k);
					}
					else if(m==3)
					{
						k =arr[i][j-1];
						add(k);
					}
					else if(m==4)
					{
						k = arr[i][j+1];
						add(k);
					}
				}
			}
		}
	}

	public static void add(int x)
	{
	   int y = x;
	   int s = 0;
	   while(y>0)
	   {
		   int u = y%10;
		   s += u;
		   y/=10;
	   }
	   System.out.print(s);
	}
}
