// Magic No
import java.util.*;
class Main {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=magic(n);
        while(res>9)
        {
            n=res;
            res=magic(n);
        }
        if(res==1)
        System.out.print("Magic Number");
        else
        System.out.print("Not a Magic Number");
 
    }
    static int magic(int x)
    {
        int s=0;
        while(x>0){
        s=s+(x%10);
        x=x/10;
        }
        return s;
    }

}