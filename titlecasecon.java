/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.print(Character.toUpperCase(s.charAt(0)));
		//String[] ar = s.split(" ");
		for(int i=1;i<s.length(); i++)
		{
		  if(Character.isWhitespace(s.charAt(i))){
		      System.out.print(" ");
     	    System.out.print(Character.toUpperCase(s.charAt(i+1)));
     	    i++;
		  }
	      else 
	       System.out.print(s.charAt(i));
		    
		}
	}
}
