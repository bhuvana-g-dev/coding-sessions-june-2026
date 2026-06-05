// Sum of Factors
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int res=fact(n);
       System.out.print(res);
    }
    static int fact(int x)
    {
        int f=0;
      for(int i=1;i<x;i++){
      if(x%i==0)
      f=f+i;
    }
     return f;   
    }
}