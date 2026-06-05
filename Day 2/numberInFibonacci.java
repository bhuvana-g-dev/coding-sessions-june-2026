//To check the no is whether present in Fibonacci series/not
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      if(fibonacci(n))
      System.out.print("yes");
      else
      System.out.print("no");
    }
static boolean fibonacci(int x)
{
        int a=-1;
        int b=1;
        int c=0;
    while(true)
    {
     c=a+b;
     if(c==x)
     return true;
     else if(c<x)
     {
     a=b;
     b=c;
     }
    else
    return false;
    }
    
}
}
