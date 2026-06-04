import java.util.*;
class Main {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isCube(n))
        System.out.print("Perfect cube");
        else
        System.out.print("Not a perfect cube");
    }
    static boolean isCube(int x)
     {
         int m=1;
        while(true)
        {
        if(m*m*m==x)
        return true;
        else if(m*m*m>x)
        return false;
        else
        m++;
        }
     }
}


