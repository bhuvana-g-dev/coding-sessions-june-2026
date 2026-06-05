//Binary to Decimal
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
    int res=binToDec(n);
    System.out.print(res);
    }
static int binToDec(int n)
{
        int x=1;
        int s=0;
    while(n>0)
    {
     s=s+(n%10)*x;
     n=n/10;
     x=x*2;
    }
    return s;
}
}

