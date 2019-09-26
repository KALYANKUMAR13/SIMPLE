import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
	
		int max = n1>n2 ? n1:n2;    //Get the max
		int lcm;
		while(true)   //1 always
		{
		   if(max%n1==0 && max%n2==0)
		   {
		       lcm=max; 
		       break;
		   }
		  max++;    
		}
		System.out.println("The of "+n1+" and "+n2+" is "+lcm);
	}
}
