//To print nth term in Fibonacci series
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      fibonacci(n);
    }
     static void fibonacci(int x)
    {
        int a=-1;
        int b=1;
        int c=0;
 for(int i=0;i<x;i++)
      {
     c=a+b;
     a=b;
     b=c;
      }
    System.out.print(c);
    }
}
