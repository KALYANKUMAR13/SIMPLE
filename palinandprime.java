import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = n-1;
        while(num>0)
        {
            if(ispali(num) && isprime(num) ==true)
            {
              System.out.println(num);
             // System.out.print("Entered num is both palindrome & prime");
              break;   
            }
              
            else
              num = num-1;
        }
    }
    public static boolean ispali(int num)
    {
        int orgi = num;
        int t = orgi;
        int revint = 0;
        while(t>0)
        {
            int r = t%10;
            revint = revint*10+r;
            t = t/10;
        }
        if(orgi == revint)
           return true;
        else
           return false;
    }
    
    public static boolean isprime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
              c++;
        }
        if(c==2)
          return true;
        else 
          return false;
    }
}
