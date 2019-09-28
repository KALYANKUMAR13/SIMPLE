
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int vowels=0,consonants=0;
		for(int i=0; i<s.length(); i++)
		{
		    if(Character.isLetter(s.charAt(i)))
		    {
		        char ch = s.charAt(i);
		        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u')
		        {
		            vowels = vowels+1;
		        }
		        else 
		          consonants =consonants+1;
		    }
		}
		System.out.println("Vowels:"+vowels);
		System.out.println("Consonants:"+consonants);
	}
}
