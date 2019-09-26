
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String[] array = s.split(" ");
		
	   for(int i=0; i<array.length; i++)
		{
		    for(int j=0;j<array.length-1;j++)
		    {
		        if(array[j].length() > array[j+1].length())
		        {
		            String temp = array[j];
		            array[j] = array[j+1];
		            array[j+1] = temp;
		            
		        }
		    }
		}
		for(int i=0; i<array.length;i++)
		{
		    System.out.print(array[i]+" ");
		}
		 
	}
}
