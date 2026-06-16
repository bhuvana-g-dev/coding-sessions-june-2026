// LCM GCD
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
   int res=LCM(a,b);
   System.out.println(res);
   int result=GCD(a,b);
   System.out.println(result);
}
static int LCM(int a,int b)
{
int max=a>b?a:b;
while(true){
if(max%a==0 && max%b==0)
return max;
max++;
 }
}
static int GCD(int a,int b)
{
    int min=a>b?b:a;
    while(true){
    if(a%min==0 && b%min==0)
return min;
min--;
}
}
}