import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m1=s.nextInt();
        int m2=s.nextInt();
        if(m1==m2)
        System.out.print(-1);
        else if(m1>m2)
        System.out.print(m1);
        else
        System.out.print(m2);
    }
}
