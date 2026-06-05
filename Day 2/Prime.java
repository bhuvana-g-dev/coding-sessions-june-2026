// Prime number
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       if(n>=2&&prime(n))
       System.out.print("prime");
       else
       System.out.print("not prime");
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
}
