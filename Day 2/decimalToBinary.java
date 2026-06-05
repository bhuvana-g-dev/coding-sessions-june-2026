//Decimal to Binary
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
    int res=decToBin(n);
    System.out.print(res);
    }
static int decToBin(int n)
{
        int x=1;
        int s=0;
    while(n>0)
    {
     s=s+(n%2)*x;
     n=n/2;
        x=x*10;
   
    }
    return s;
}
}

