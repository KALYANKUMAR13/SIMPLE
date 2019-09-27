import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = scan.nextInt();
		int y=0;
		StringBuilder ss = new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
		    if(Character.isDigit(s.charAt(i)))
		      y=y*10 + (int)(s.charAt(i)) -48;
		      //ss.append(s.charAt(i));
		}
	//	String k = ss.toString();
		//int nu =Integer.parseInt(k);
		int sum =y+n;
		System.out.print(sum);
	}
}
