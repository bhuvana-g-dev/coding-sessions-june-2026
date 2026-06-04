// Abundant No
import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=perfect(n);
        if(res>n)
        System.out.print("Abundant Number");
        else
        System.out.print("Not a Abundant Number");
 
    }
    static int perfect(int x)
    {
        int s=0;
        for(int i=1;i<x;i++)
        {
            if(x%i==0)
            s=s+i;
        }
        return s;
    }

}