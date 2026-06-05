// Palindrome
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int res=pal(n);
       if(res==n)
       System.out.print("palindrome");
       else
       System.out.print("not a palindrome");
    }
    static int pal(int x)
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
