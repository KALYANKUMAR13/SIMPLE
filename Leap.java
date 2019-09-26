import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year:");
		int n = scan.nextInt();
		if( ( (n%4==0)&&(n%100!=0) ) || (n%400==0) )
		 System.out.print(n+" is a LEAP YEAR");
		else 
		 System.out.print(n+" is NOT A LEAP YEAR");
	}
}
