import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=sum(n);
        System.out.print(res);
    }
    static int sum(int x)
    {
        int s=0;
        while(x>0){
        s=s+(x%10);
        x=x/10;
        }
        return s;
    }
}
