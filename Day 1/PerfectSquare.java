import java.util.*;
class Main {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isSquare(n))
        System.out.print("Perfect square");
        else
        System.out.print("Not a perfect square");
    }
    static boolean isSquare(int x)
     {
         int m=1;
        while(true)
        {
        if(m*m==x)
        return true;
        else if(m*m>x)
        return false;
        else
        m++;
        }
     }
}
