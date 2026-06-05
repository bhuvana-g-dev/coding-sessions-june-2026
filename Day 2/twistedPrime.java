// Twisted prime
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int res=rev (n);
       if(n>=2 &&res>=2 && prime(n)&& prime(res))
       System.out.print("twisted");
       else
       System.out.print("not twisted");
    }
    static boolean prime(int x)
    {
      for(int i=2;i<=x/2;i++)
      {
      if(x%i==0)
      return false;
      }
      return true;
    }
    
     static int rev(int x)
    {
        int r=0;
      while(x>0)
      {
     r=r*10+(x%10);
     x=x/10;
      }
      return r;
    }
}
