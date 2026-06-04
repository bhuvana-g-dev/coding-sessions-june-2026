import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isSpy(n))
        System.out.print("Spy Number");
        else
        System.out.print("Not Spy Number");
    }
    static boolean isSpy(int x)
     {
        int s1=0;
        int s2=1;
        while(x>0){
        s1=s1+(x%10);
        s2=s2*(x%10);
        x=x/10;
        }
        if(s1==s2)
        return true;
        return false;
    }
}
