import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=isNeon(n);
        if(n==res)
        System.out.print("Neon");
        else
        System.out.print("Not Neon");

    }
    static int isNeon(int x)
    {
        x=x*x;
        int s=0;
        while(x>0){
        s=s+(x%10);
        x=x/10;
        }
      return s;
    }
}