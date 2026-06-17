
import java.util.*;
public class pattern {
public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char ch='A';
        for(int i = 1; i <= n; i++) {
            int x=(int)ch+i-1;
            for(int j = 1; j <= i; j++) {
                System.out.print((char)x+" ");
            }

            System.out.println();
        }
    }
}