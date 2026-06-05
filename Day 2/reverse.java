// Reverse number
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int res=rev(n);
       System.out.print(res);
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
